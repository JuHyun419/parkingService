package domain;

import domain.enums.CarTypeEnum;

public class CarInfo {
    private CarTypeEnum carType;
    private String capacity;

    public CarInfo(String carType, String capacity){

        this.capacity = capacity;

    }

    public CarTypeEnum getCarType() {
        return carType;
    }

    public void setCarType(CarTypeEnum carType) {
        this.carType = carType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
