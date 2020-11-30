package controller;

import domain.CarInfo;
import service.ParkingService;

import java.util.Map;

public class ParkingController {

    public final ParkingService parkingService = new ParkingService();

    public void innerCar(String type, int capacity, String carNumber) {
        try{
            parkingService.innerCar(type, capacity, carNumber);
        }catch (Exception e){
            System.out.println(e.getMessage() + " Car Number: " + carNumber);
        }
    }

    public void exitCar(String carNumber) throws Exception {
        parkingService.exitCar(carNumber);
    }

    public Map<String, CarInfo> getCarList(){
        return parkingService.getCarList();
    }

    public double getTotalSettlement(){
        return parkingService.getTotalSettlement();
    }
}
