
public class Split {
	public static  void main(String[] args) {
		String s = "potato apple lemon orange";
		
		String[] vector = s.split(" ");
		
		
		for (int i = 0; i <= 3; i++) {
			System.out.printf("Fragmento %d: %s%n", i, vector[i]);
		}
	}
}
