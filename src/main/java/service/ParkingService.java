package service;

import domain.CarInfo;
import domain.ParkingExit;
import domain.ParkingLot;
import domain.ParkingTime;
import domain.enums.CarTypeEnum;
import util.EnumUtil;
import util.SettlementUtil;

import java.util.Map;

public class ParkingService {

    // TODO: 전역변수,, 어디다 선언?
    // Map carList -> List carInfo(interface)
    // parkingLot에 carList 넣기
    public static ParkingLot parkingLot = new ParkingLot();

    public static ParkingExit parkingExit = new ParkingExit();

        // TODO: 입차
    public void innerCar(String type, int capacity, String carNumber) throws Exception {

        CarTypeEnum carType = EnumUtil.getCarType(type, capacity);

        if (parkingLot.isInclude(carNumber)) {
            throw new Exception("Vehicle already parked.");
        }
        parkingLot.put(carNumber, new CarInfo(carType, capacity));

    }

    // TODO: 차량 조회
    public static Map<String, CarInfo> getCarList() {
        return parkingLot.getCarList();
    }

    // TODO: 출차, 정산 (전기차 충전량 계산 추가)
    public void exitCar(String carNumber) throws Exception {

        if (!parkingLot.isInclude(carNumber)) {
            throw new Exception("The vehicle does not have the number you entered.");
        }

        CarInfo carInfo = parkingLot.getCarInfo(carNumber);

        ParkingTime parkingTime = carInfo.getParkingTime();

        double settlement;

        if( carInfo.getCarType().equals(CarTypeEnum.CAR_ELECTRIC) ){
            settlement = SettlementUtil.getSettlementElectric(carInfo.getCarType(), parkingTime.getParkingTime(), carInfo.getCapacity());
        }else {
            settlement = SettlementUtil.getSettlement(carInfo.getCarType(), parkingTime.getParkingTime());
        }
        parkingExit.add(carNumber, settlement);
        System.out.println("settlement = " + settlement);

    }

    // TODO: 수익 조회
    public double getTotalSettlement(){
        return parkingExit.getTotalSettlement();
    }

}
