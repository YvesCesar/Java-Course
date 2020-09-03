package model.services;

import java.util.Date;

public interface PaymentService {
	
	double quota(Date date, int quantity,  double value);
}
