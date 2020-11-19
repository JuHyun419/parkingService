package service;

import domain.CarInfo;
import domain.ParkingExit;
import domain.ParkingLot;
import domain.enums.CarTypeEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingService {

    public static Map<String, CarInfo> carList = new HashMap<>();
    public static List<ParkingLot> parkingLotList = new ArrayList<>();
    public static List<ParkingExit> parkingExitList = new ArrayList<>();

    // 입차
    public void innerCar(String carNumber){
    }
    // 출차
}
