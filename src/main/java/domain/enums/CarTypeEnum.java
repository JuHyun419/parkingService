package domain.enums;


public enum CarTypeEnum {

    CAR_NORMAL("CAR_NORMAL", CarFeeEnum.CAR_NORMAL),
    CAR_ELECTRIC("CAR_ELECTRIC", CarFeeEnum.CAR_ELECTRIC),

    BUS_BIG("BUS_BIG", CarFeeEnum.BUS_BIG),
    BUS_MIDDLE("BUS_MIDDLE", CarFeeEnum.BUS_MIDDLE),
    BUS_SMALL("BUS_SMALL", CarFeeEnum.BUS_SMALL),

    TRUCK_BIG("TRUCK_BIG", CarFeeEnum.TRUCK_BIG),
    TRUCK_MIDDLE("TRUCK_MIDDLE", CarFeeEnum.TRUCK_MIDDLE),
    TRUCK_SMALL("TRUCK_SMALL", CarFeeEnum.TRUCK_SMALL);

    private String type;
    private CarFeeEnum carFeeEnum;

    CarTypeEnum(String type,CarFeeEnum carFeeEnum){
        this.type = type;
        this.carFeeEnum = carFeeEnum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CarFeeEnum getCarFeeEnum() {
        return carFeeEnum;
    }

    public void setCarFeeEnum(CarFeeEnum carFeeEnum) {
        this.carFeeEnum = carFeeEnum;
    }


}
