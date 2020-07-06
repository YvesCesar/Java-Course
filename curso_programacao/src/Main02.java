import java.util.Locale;

public class Main02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double x = 10.74356;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		Locale.setDefault(Locale.US);

	}

}
