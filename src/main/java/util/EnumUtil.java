package util;

import domain.enums.CarTypeEnum;

public class EnumUtil {
    // TODO: 차종 선택
    public static CarTypeEnum getCarType(String type, int capacity) throws Exception {

        if (type.toUpperCase().equals("C")) {
            if (capacity > 0) return CarTypeEnum.CAR_ELECTRIC;
            return CarTypeEnum.CAR_NORMAL;

        } else if (type.toUpperCase().equals("B")) {
            if (capacity < 20)
                return CarTypeEnum.BUS_SMALL;
            else if (capacity < 40)
                return CarTypeEnum.BUS_MIDDLE;
            return CarTypeEnum.BUS_BIG;

        } else if (type.toUpperCase().equals("T")) {
            if (capacity < 5)
                return CarTypeEnum.TRUCK_SMALL;
            else if (capacity < 10)
                return CarTypeEnum.TRUCK_MIDDLE;
            return CarTypeEnum.TRUCK_BIG;
        }

        throw new Exception("The value is not valid.\nPlease re-enter.");
    }
}
