package PaymentMethodImpl;

import interfaces.PaymentMethod;
import ood.PayCheck;

public class PayByBank implements PaymentMethod {
	private String bank;
	private int account;
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	@Override
	public void pay(PayCheck pc) {
		// TODO Auto-generated method stub
		
	}
}
