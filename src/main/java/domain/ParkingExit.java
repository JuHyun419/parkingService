package domain;

public class ParkingExit {
    private String carNumber;
    private Long settlement;

    public ParkingExit(String carNumber, Long settlement){
        this.carNumber = carNumber;
        this.settlement = settlement;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Long getSettlement() {
        return settlement;
    }

    public void setSettlement(Long settlement) {
        this.settlement = settlement;
    }
}
