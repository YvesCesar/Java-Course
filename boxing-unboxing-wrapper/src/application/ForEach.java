package application;

public class ForEach {

	public static void main(String[] args) {
		
		//Instanciando vetor com três posições:
		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		
		for ( int i = 0; i < vect.length; i++ ) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-----------------------");
		
		for ( String names : vect ) {
			System.out.println(names);
		}
	}

}
