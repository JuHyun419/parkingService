package domain.enums;

public enum CarFeeEnum{
    CAR_NORMAL(30, 2000L, 10, 1000L),
    CAR_ELECTRIC(30, 2000L, 10, 1000L),

    BUS_BIG(60, 5000L, 30, 3000L),
    BUS_MIDDLE(60, 3000L, 30, 2000L),
    BUS_SMALL(60, 2000L, 30, 1000L),

    TRUCK_BIG(60, 4000L, 60, 4000L),
    TRUCK_MIDDLE(60, 3000L, 60, 3000L),
    TRUCK_SMALL(60, 2000L, 60, 2000L);

    private int defaultMinute;
    private Long defaultFee;

    private int extraMinute;
    private Long extraFee;

    CarFeeEnum(int defaultMinute, Long defaultFee, int extraMinute, Long extraFee){
        this.defaultMinute = defaultMinute;
        this.defaultFee = defaultFee;
        this.extraMinute = extraMinute;
        this.extraFee = extraFee;
    }

    public int getDefaultMinute() {
        return defaultMinute;
    }

    public void setDefaultMinute(int defaultMinute) {
        this.defaultMinute = defaultMinute;
    }

    public Long getDefaultFee() {
        return defaultFee;
    }

    public void setDefaultFee(Long defaultFee) {
        this.defaultFee = defaultFee;
    }

    public int getExtraMinute() {
        return extraMinute;
    }

    public void setExtraMinute(int extraMinute) {
        this.extraMinute = extraMinute;
    }

    public Long getExtraFee() {
        return extraFee;
    }

    public void setExtraFee(Long extraFee) {
        this.extraFee = extraFee;
    }
}
