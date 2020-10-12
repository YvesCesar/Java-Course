package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		 Set<String> set = new LinkedHashSet<>();
		// Set<String> set = new HashSet<>();
		//Set<String> set = new TreeSet<>();
		
		// Se a ordem não importa, o HashSet é indicado por ser mais rápido, não garantindo a ordem
		// TreeSet mantém os dados ordenados
		// LinkedHashSet mantém a ordem que os dados foram inseridos
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		// System.out.println(set.contains("Notebook"));
		
		// set.remove("Tablet");
		// set.removeIf(x -> x.length() >= 3);
		// set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}
	}

}
