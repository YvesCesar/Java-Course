package exercise;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double currentDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double desiredDollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in real R$%.2f%n", CurrencyConverter.calcDolar(currentDollar, desiredDollar));
		
		sc.close();
	}

}
