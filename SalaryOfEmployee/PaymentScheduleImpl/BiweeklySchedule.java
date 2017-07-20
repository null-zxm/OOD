package PaymentScheduleImpl;

import java.util.Date;

import interfaces.PaymentSchedule;
import ocp.DateUtil;

public class BiweeklySchedule implements PaymentSchedule {
	Date firstPayableFriday =DateUtil.pareDate("2017-4-3");
	@Override
	//firstPayableFriday 第一次支付的周5 
	public boolean isPayDay(Date date) {
		long interval=DateUtil.getDaysBetween(date,firstPayableFriday);
		return interval%14==0;
	}

	@Override
	public Date getPayPeriodStartDate(Date date) {
		return null;
	}

}
