package domain;


import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private Map<String, CarInfo> carList = new HashMap<>();

    public CarInfo getCarInfo(String carNumber){
        try {
            return carList.get(carNumber);
        }finally {
            carList.remove(carNumber);
        }

    }

    public void put(String carNumber, CarInfo carInfo){
        carList.put(carNumber, carInfo);
    }

    public boolean isInclude(String carNumber){
        if(this.carList.get(carNumber) == null) return false;
        return true;
    }

    public Map<String, CarInfo> getCarList() {
        return carList;
    }

    public void setCarList(Map<String, CarInfo> carList) {
        this.carList = carList;
    }
}
