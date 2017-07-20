package PaymentScheduleImpl;

import java.util.Date;

import interfaces.PaymentSchedule;
import ocp.DateUtil;

public class MonthlySchedule implements PaymentSchedule {

	@Override
	public boolean isPayDay(Date date) {
		return DateUtil.isLastDayOfMonth(date);
	}

	@Override
	public Date getPayPeriodStartDate(Date date) {
		return DateUtil.getFirstDay(date);
	}

}
