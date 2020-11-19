package domain;

import java.time.Instant;

public class ParkingTime {
    // 입차 시간
    private Instant entryTime;
    // 출차 시간
    private Instant departureTime;

    public Instant getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Instant entryTime) {
        this.entryTime = entryTime;
    }

    public Instant getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Instant departureTime) {
        this.departureTime = departureTime;
    }
}
