package PaymentMethodImpl;

import interfaces.PaymentMethod;
import ood.PayCheck;

public class PayByMail implements PaymentMethod {
		private String address;

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public void pay(PayCheck pc) {
			// TODO Auto-generated method stub
			
		}
		
}
