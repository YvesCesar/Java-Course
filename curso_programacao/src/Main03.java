import java.util.Locale;
import java.util.Scanner;


public class Main03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Lendo char:
		 *
		 *char x;
		 *x = sc.next().charAt(0);
		*/
		String x;
		double y;
		int z;
		
		//Preenchimento dividido por espaço OU Enter!!!
		x = sc.nextLine();
		y = sc.nextDouble();
		z = sc.nextInt();
		
		System.out.println("Valores digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		sc.close();
		
	}

}
