
public class StringFunctions {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String minuscula = original.toLowerCase();
		String maiuscula = original.toUpperCase();
		String eliminaEspacos = original.trim();
		String quebraString = original.substring(2);
		String quebraString2 = original.substring(2, 9);
		String trocaCaractere = original.replace('a', 'x');
		String trocaString = original.replace("abc", "xy");
		int buscaPrimeiraOcorrencia = original.indexOf("bc");
		int buscaUltimaOcorrencia = original.lastIndexOf("bc");
		
		System.out.println("Original: -"+original+"-");
		System.out.println("toLowerCase: -"+minuscula+"-");
		System.out.println("toUpperCase: -"+maiuscula+"-");
		System.out.println("trim: -"+eliminaEspacos+"-"); //Elimina espaços inúteis 
		System.out.println("substring(2): -"+quebraString+"-");
		System.out.println("substring(2, 9): -"+quebraString2+"-");
		System.out.println("replace('a', 'x'): -"+trocaCaractere+"-");
		System.out.println("replace('abc', 'xy'): -"+trocaString+"-");
		System.out.println("indexOf('bc'): "+buscaPrimeiraOcorrencia);
		System.out.println("lastindexOf('bc'): "+buscaUltimaOcorrencia);
		
		
	}

}
