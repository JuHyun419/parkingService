import controller.ParkingController;
import domain.CarInfo;

import java.util.Map;

public class Main {
    public static final ParkingController parkingController = new ParkingController();
    public static void main(String[] args) {
        parkingController.innerCar("C", 0, "A1234");
        parkingController.innerCar("C", 10, "A1235");
        parkingController.innerCar("C", 0, "A1234");
        Map<String, CarInfo> c =  parkingController.getCarList();
        System.out.println("aa");
    }
}
