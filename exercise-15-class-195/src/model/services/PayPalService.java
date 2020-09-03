package model.services;

import java.util.Date;

public class PayPalService implements PaymentService {
	
	@Override
	public double quota(Date date, int quantity, double value) {
		return 0;
	}

}
