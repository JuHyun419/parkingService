import controller.ParkingController;
import controller.ViewController;
import domain.CarInfo;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final ParkingController parkingController = new ParkingController();
    public static final ViewController viewController = new ViewController(parkingController);
    public static void main(String[] args) throws Exception {

        viewController.parkingView();


    }
}
