package entities;

public class Register {
	private int number;
	private String name;
	private double bankDeposit;
	
	public Register( int number, String name, double initialDeposit ) {
		this.number = number;
		this.name = name;
		
		//Encapsulando a regra de nogócio relativa a depósito
		depositMoney( initialDeposit ); // Melhor para a regra do negócio, protegendo o construtor de alterações futuras no depósito
	}
	
	//Caso não tenha valor inicial de depósito
	public Register( int number, String name ) {
		this.number = number;
		this.name = name;
	}
	
	public void setName( String newName ) {
		this.name = newName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void withdrawMoney( double money ) {
		double rate = 5.0;
		this.bankDeposit -= (money + rate);
	}
	
	public void depositMoney( double money ) {
		this.bankDeposit += money;
	}
	
	public double getBankDeposit() {
		return this.bankDeposit;
	}
	
	public String toString() {
		return "Account "+getNumber() +
				", Holder: "+this.name +
				", Balance: $ "+ String.format("%.2f", getBankDeposit());
	}
}
