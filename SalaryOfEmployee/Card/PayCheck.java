package Card;

import java.util.Date;

//支付计划
public class PayCheck {
	private Date payPeriodStart; //开始计算工资的开始时间
	private Date payPeriodEnd;		//	计算工资的结束时间
	private double grossPay; //一共支付的钱
	private double deductions;// 扣除的钱
	private double netPay;//实际支付的钱
	public Date getPayPeriodStart() {
		return payPeriodStart;
	}
	public void setPayPeriodStart(Date payPeriodStart) {
		this.payPeriodStart = payPeriodStart;
	}
	public Date getPayPeriodEnd() {
		return payPeriodEnd;
	}
	public void setPayPeriodEnd(Date payPeriodEnd) {
		this.payPeriodEnd = payPeriodEnd;
	}
	public double getGrossPay() {
		return grossPay;
	}
	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}
	public double getDeductions() {
		return deductions;
	}
	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}
	public double getNetPay() {
		return grossPay-deductions ;
	}
}
