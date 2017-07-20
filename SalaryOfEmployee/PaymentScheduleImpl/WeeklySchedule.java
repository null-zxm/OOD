package PaymentScheduleImpl;

import java.util.Date;

import interfaces.PaymentSchedule;
import ocp.DateUtil;

public class WeeklySchedule implements PaymentSchedule {

	@Override
	public boolean isPayDay(Date date) {
		return DateUtil.isFirday(date);
	}
	@Override
	public Date getPayPeriodStartDate(Date date) {
		return DateUtil.add(date,-6);
	}
}
