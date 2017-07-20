 package Employee;

import java.util.Date;
/*
 * 一个职员应该要哪一些属性？哪一些方法 呢？
 * 基本 属性：ID 姓名  住址
 * 职员类型 会员 工资计算方法  得到工资的方法
 * 
 * 
 */

import interfaces.Affiliation;
import interfaces.PaymentClassification;
import interfaces.PaymentMethod;
import interfaces.PaymentSchedule;
import ood.PayCheck;

public class Employee {
	private String id;
	private String name;
	private String address;
	Affiliation affiliation;
	PaymentClassification classification;
	PaymentSchedule schedule;
	PaymentMethod method;
	public boolean isPayDay(Date date){
		return schedule.isPayDay(date);
	}
	public void payDay(PayCheck pc){
		double grossPay=classification.calculatePay(pc);
		double deductions =affiliation.calculateDeductions(pc);
		pc.setGrossPay(grossPay);
		pc.setDeductions(deductions);
		method.pay(pc);
	}
}
