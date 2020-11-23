package service;

import domain.enums.CarFeeEnum;
import domain.enums.CarTypeEnum;

public class SettlementService {

    // 정산
    public Long getSettlement(CarTypeEnum carType, int parkingTime){
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
