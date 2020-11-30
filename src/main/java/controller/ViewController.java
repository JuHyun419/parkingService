package controller;

import domain.CarInfo;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ViewController {

    private final Scanner sc = new Scanner(System.in);
    private final ParkingController parkingController;
    public ViewController(ParkingController parkingController) {
        this.parkingController = parkingController;
    }

    public void parkingView() throws Exception {
        boolean flg = true;
        while (flg) {
            System.out.println("=============== PARKING SERVICE ===============");
            System.out.println(" 1. 입차");
            System.out.println(" 2. 출차");
            System.out.println(" 3. 주차 목록");
            System.out.println(" 4. 총 수입");
            System.out.println(" 5. 종료");
            System.out.println("사용하실 항목을 선택해주세요.");
            String number = sc.next();
            switch (number) {
                case "1":
                    this.innerCar();
                    break;
                case "2":
                    this.exitCar();
                    break;
                case "3":
                    this.getCarList();
                    break;
                case "4":
                    this.getTotalSettlement();
                    break;
                case "5":
                    System.out.println("=============== 5. 종료 ===============");
                    flg = false;
                    break;
            }
        }
    }

    public void innerCar(){
        System.out.println("=============== 1. 입차 ===============");
        System.out.println("일반차(C) 트럭(T) 버스(B)");
        String type = "c";
        parkingController.innerCar(type, 0, "A1234");
        System.out.println();
    }
    public void exitCar() throws Exception {
        System.out.println("=============== 2. 출차 ===============");
        parkingController.exitCar("A1234");
        System.out.println();
    }
    public void getCarList(){
        System.out.println("=============== 3. 차량 목록 ===============");
        Map<String, CarInfo> carList = parkingController.getCarList();
        Set<String> carNumbers = carList.keySet();
        System.out.println("차량번호\t차량종류\t\t용량\t입차시간");
        for(String carNumber : carNumbers){
            System.out.println(carNumber+"\t"+carList.get(carNumber));
        }

        System.out.println();
    }
    public void getTotalSettlement(){
        System.out.println("=============== 4. 총 수입 ===============");
        System.out.println("총 수입: "+parkingController.getTotalSettlement());
        System.out.println();
    }


}
