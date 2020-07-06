import java.util.Scanner;

public class AplicacaoBitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000; //Declarando um número binário em java
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();
	}

}
