package controller;

import domain.CarInfo;
import service.ParkingService;

import java.util.Map;

public class ParkingController {

    public final ParkingService parkingService = new ParkingService();

    // TODO: 입차
    public void innerCar(String type, int capacity, String carNumber) {

        try{
            parkingService.innerCar(type, capacity, carNumber);
        }catch (Exception e){
            System.out.println(e.getMessage()+" Car Number: " + carNumber);
        }

    }
    // TODO: 출차

    // TODO: 정산

    // TODO: 차량 조회
    public Map<String, CarInfo> getCarList(){
        return parkingService.getCarList();
    }
    // TODO: 수입 조회

}
