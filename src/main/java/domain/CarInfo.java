package domain;

import domain.enums.CarTypeEnum;

public class CarInfo {
    private CarTypeEnum carType;
    private int capacity;
    private ParkingTime parkingTime = new ParkingTime();

    public CarInfo(CarTypeEnum carType, int capacity){
        this.carType = carType;
        this.capacity = capacity;
    }

    public CarTypeEnum getCarType() {
        return carType;
    }

    public void setCarType(CarTypeEnum carType) {
        this.carType = carType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingTime getParkingTime() {
        return parkingTime;
    }

    public void setParkingTime(ParkingTime parkingTime) {
        this.parkingTime = parkingTime;
    }
}
