package PaymentClassificationImpl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import interfaces.PaymentClassification;
import ocp.DateUtil;
import ood.PayCheck;
import ood.SalaryReceipt;

public class CommissionClassification implements PaymentClassification {
	double salary;//基本工资
	double rate;// 一件提成
	Map<Date, SalaryReceipt> salaryReceipts=new HashMap<>();
	@Override
	public double calculatePay(PayCheck pc) {
		double total = 0;
		for(SalaryReceipt salaryReceipt:salaryReceipts.values()){
			if(DateUtil.between(salaryReceipt.getSaleDate(),pc.getPayPeriodStart(),pc.getPayPeriodEnd())){
				total +=salaryReceipt.getAmount()*rate;
			}
		}
		return total;
	}
	//添加 业务卡
	public void addSalaryReceipt(SalaryReceipt s){
		salaryReceipts.put(s.getSaleDate(), s);
	}


	
}
