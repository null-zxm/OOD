package PaymentClassificationImpl;

import java.util.Date;
import java.util.Map;

import interfaces.PaymentClassification;
import ocp.DateUtil;
import ood.PayCheck;
import ood.TimeCard;

public class HourlyClassification implements PaymentClassification {
	private double rate;
	private Map<Date, TimeCard> timeCard;
	public double calculatePay(PayCheck pc){
		double totalPay=0;
		//还要加上判断是否在日期内
		
		for (TimeCard tc : timeCard.values()) {
			if(DateUtil.between(tc.getDate(),pc.getPayPeriodStart(),pc.getPayPeriodEnd())){
			if(tc.getHours()<=8){
				totalPay +=rate;
			}else if(tc.getHours()>8){
				totalPay =totalPay+8*rate+(tc.getHours()-8)*1.5*rate;
			}
			}
		}
		
		return totalPay;
	}

	
}
