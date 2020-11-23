package service;

import domain.CarInfo;
import domain.ParkingExit;
import domain.ParkingLot;
import domain.ParkingTime;
import domain.enums.CarTypeEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingService {

    public static Map<String, CarInfo> carList = new HashMap<>();
    public static List<ParkingLot> parkingLotList = new ArrayList<>();
    public static List<ParkingExit> parkingExitList = new ArrayList<>();

    public final SettlementService settlementService = new SettlementService();

    public void innerCar(String type,int capacity, String carNumber) throws Exception {

        CarTypeEnum carType = this.getCarType(type, capacity);

        if(carList.get(carNumber) != null){
            throw new Exception("Vehicle already parked.");
        }

        carList.put(carNumber,new CarInfo(carType,capacity));
    }

    public void exitCar(String carNumber) throws Exception {

        if(carList.get(carNumber) == null){ throw new Exception("The vehicle does not have the number you entered."); }

        CarInfo carInfo = carList.get(carNumber);

        ParkingTime parkingTime = carInfo.getParkingTime();

        Long settlement = settlementService.getSettlement(carInfo.getCarType(), parkingTime.getParkingTime());

        parkingExitList.add(new ParkingExit(carNumber, settlement));
        System.out.println("settlement = " + settlement);

    }

    // 차량 조회
    public static Map<String, CarInfo> getCarList() {
        return carList;
    }

    // 차종
    public CarTypeEnum getCarType(String type, int capacity) throws Exception {

        if(type.toUpperCase().equals("C")){
            if(capacity > 0) return CarTypeEnum.CAR_ELECTRIC;
            return CarTypeEnum.CAR_NORMAL;

        }else if(type.toUpperCase().equals("B")){
            if(capacity < 20)
                return CarTypeEnum.BUS_SMALL;
            else if(capacity < 40)
                return CarTypeEnum.BUS_MIDDLE;
            return CarTypeEnum.BUS_BIG;

        }else if(type.toUpperCase().equals("T")){
            if(capacity < 5)
                return CarTypeEnum.TRUCK_SMALL;
            else if(capacity < 10)
                return CarTypeEnum.TRUCK_MIDDLE;
            return CarTypeEnum.TRUCK_BIG;
        }

        throw new Exception("The value is not valid.\n" +
                "Please re-enter.");
    }


}
