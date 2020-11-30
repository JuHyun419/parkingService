package domain;

import java.time.Instant;
import java.time.ZoneOffset;

public class ParkingTime {
    private Instant entryTime = Instant.now();

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

    @Override
    public String toString() {
        return entryTime.toString();
    }
}
