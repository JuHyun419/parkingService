package util;

import domain.enums.CarFeeEnum;
import domain.enums.CarTypeEnum;

public class SettlementUtil {

    public static Long getSettlement(CarTypeEnum carType, int parkingTime){
        return getSettlement(carType, parkingTime, 0);
    }

    // capacity - 전기차 계산용
    public static Long getSettlement(CarTypeEnum carType, int parkingTime, double capacity){
        CarFeeEnum carFee = carType.getCarFeeEnum();
        Long pay = 0L;

        int defaultMinute = carFee.getDefaultMinute();

        if(defaultMinute > parkingTime){
            System.out.println("parkingTime = " + parkingTime);
            return carFee.getDefaultFee();
        }

        pay += carFee.getDefaultFee();
        System.out.println("parkingTime = " + parkingTime);
        parkingTime -= defaultMinute;
        pay += (parkingTime/carFee.getExtraMinute())*carFee.getExtraFee();

        return pay;
    }

}
