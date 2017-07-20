package interfaces;

import java.util.Date;
//支付计划
public interface PaymentSchedule {
	boolean isPayDay(Date date);
	Date getPayPeriodStartDate(Date date);
}
