package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06; 
	
	public static double calcDolar( double currentDollar, double desiredDollar ) {
		currentDollar += currentDollar * IOF;
		return (desiredDollar * currentDollar); 
	}
}
