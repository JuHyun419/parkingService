package util;

import domain.enums.CarFeeEnum;
import domain.enums.CarTypeEnum;

public class SettlementUtil {

    private static final double CHARGE_MINUTE = 0.2;
    private static final Long CHARGE_PAY = 2000L;
    private static final double MAX_CHARGE = 60;

    public static double getSettlement(CarTypeEnum carType, int parkingTime){
        return getSettlementElectric(carType, parkingTime, 0);
    }

    public static double getSettlementElectric(CarTypeEnum carType, int parkingTime, double capacity){
        CarFeeEnum carFee = carType.getCarFeeEnum();
        double pay = 0;

        int defaultMinute = carFee.getDefaultMinute();

        if(defaultMinute > parkingTime){
            System.out.println("parkingTime = " + parkingTime);
            return carFee.getDefaultFee();
        }


        pay += carFee.getDefaultFee();

        parkingTime -= defaultMinute;
        pay += (parkingTime/carFee.getExtraMinute())*carFee.getExtraFee();
        if(capacity != 0){
            pay += chargeElectricPay(parkingTime, capacity);
        }
        return pay;
    }

    private static double chargeElectricPay(int parkingTime, double capacity){
        if(parkingTime*CHARGE_MINUTE > MAX_CHARGE){
            return ((MAX_CHARGE-capacity)/CHARGE_MINUTE)*CHARGE_PAY;
        }
        else{
            return CHARGE_MINUTE*CHARGE_PAY;
        }
    }

}
