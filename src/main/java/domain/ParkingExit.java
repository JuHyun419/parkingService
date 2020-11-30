package domain;

import java.util.ArrayList;
import java.util.List;

public class ParkingExit {
    private List<String> carNumber = new ArrayList<>();
    private double totalSettlement = 0L;

    public void add(String carNumber, double settlement){
        this.carNumber.add(carNumber);
        this.totalSettlement += settlement;
    }

    public List<String> getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(List<String> carNumber) {
        this.carNumber = carNumber;
    }

    public double getTotalSettlement() {
        return totalSettlement;
    }

    public void setTotalSettlement(double totalSettlement) {
        this.totalSettlement = totalSettlement;
    }
}
