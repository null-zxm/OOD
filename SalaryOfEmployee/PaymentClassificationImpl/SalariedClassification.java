package PaymentClassificationImpl;

import interfaces.PaymentClassification;
import ood.PayCheck;

public class SalariedClassification implements PaymentClassification {
	private int salary; //按月拿工资

	@Override
	public double calculatePay(PayCheck pc) {
		return salary;
	}

	
}
