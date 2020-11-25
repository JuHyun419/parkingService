import controller.ParkingController;
import domain.CarInfo;
import org.junit.Test;

import java.util.Map;

public class TestClass {

    @Test
    public void 입차() {
        ParkingController parkingController = new ParkingController();
        parkingController.innerCar("C", 0, "A1234");
        parkingController.innerCar("C", 10, "A12345");
        parkingController.innerCar("T", 50, "A123456");
        parkingController.innerCar("b", 20, "A1234567");
        Map<String, CarInfo> c =  parkingController.getCarList();

        System.out.println("c = " + c);
    }

    @Test
    public void 출차() throws Exception {
        ParkingController parkingController = new ParkingController();
        parkingController.innerCar("C", 0, "A1234");
        parkingController.innerCar("C", 10, "A12345");
        parkingController.innerCar("T", 50, "A123456");
        parkingController.innerCar("b", 20, "A1234567");

        parkingController.exitCar("A1234");
        parkingController.exitCar("A12345");
        parkingController.exitCar("A123456");
        parkingController.exitCar("A1234567");
    }

    @Test
    public void 수입() throws Exception {
        ParkingController parkingController = new ParkingController();
        parkingController.innerCar("C", 0, "A1234");
        parkingController.innerCar("C", 10, "A12345");
        parkingController.innerCar("T", 50, "A123456");
        parkingController.innerCar("b", 20, "A1234567");

        parkingController.exitCar("A1234"); // 2000
        parkingController.exitCar("A12345"); // 2000
        parkingController.exitCar("A123456"); // 4000
        parkingController.exitCar("A1234567"); // 3000

        System.out.println(parkingController.getTotalSettlement());

    }
}
