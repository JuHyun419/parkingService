package domain;

import domain.enums.CarTypeEnum;


/*
* 차량을 인터페이스로 만들어 각각의 차량에서 정산 계산식을 작성..?
*
* */
public class CarInfo {

    private CarTypeEnum carType;
    private double capacity;
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public ParkingTime getParkingTime() {
        return parkingTime;
    }

    public void setParkingTime(ParkingTime parkingTime) {
        this.parkingTime = parkingTime;
    }
}
