package domain;

import java.time.Instant;
import java.time.ZoneOffset;

public class ParkingTime {
    // 입차 시간
    private Instant entryTime = Instant.now();
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

    public int getParkingTime(){
        departureTime = Instant.now();
        return departureTime.atZone(ZoneOffset.UTC).getMinute() - entryTime.atZone(ZoneOffset.UTC).getMinute();
    }
}
