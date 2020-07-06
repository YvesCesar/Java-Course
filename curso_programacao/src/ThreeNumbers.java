import java.util.Scanner;

public class ThreeNumbers {

	public static void main(String[] args) {
		maiorValor();
	}
	
	
	public static int maiorValor() {
		Scanner sc = new Scanner(System.in);
		int vector[] = new int[3], maior = 0;
		
		for (int i = 0;i < 3;i++) {
			System.out.printf("Digite o %dº valor:", i + 1);
			vector[i] = sc.nextInt();
			
			if (vector[i] > maior) {
				maior = vector[i];
			}
		}
		
		System.out.println("O maior valor digitado foi: "+maior);
		
		sc.close();
		
		return maior;
	}

}
