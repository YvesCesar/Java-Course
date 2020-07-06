package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		//Declarando uma lista
		List< String > list = new ArrayList<>();
		
		//Adicionando elementos na lista:
		
		list.add("Yves");
		list.add("César");
		list.add("Amorim");
		list.add("de");
		list.add("Maria");
		list.add("Marco");
		
		//Adicionando na posição 2 a String "Olá"
		list.add( 2, "Olá" );
		
		//Removendo elementos de duas formas
		list.remove( "de" );
		list.remove( 1 );
		
		//Retorna o tamanho da lista
		System.out.println("Tamanho da Lista: " + list.size());
		
		for ( String elementos : list ) {
			System.out.println(elementos);
		}
		
		System.out.println("---------------");
		
		// Sendo x -> x.charAt(0) == 'M' uma função lambda, temos:
		list.removeIf( x -> x.charAt(0) == 'M' );
		//Removendo elementos cuja primeira letra é M
		
		for ( String elementos : list ) {
			System.out.println(elementos);
		}
		
		System.out.println("---------------");
		
		//Buscar Índice de Valores
		System.out.println("Index of Amorim: " + list.indexOf("Amorim"));
		System.out.println("Index of Azul: " + list.indexOf("Azul"));
		
		System.out.println("---------------");
		list.add("Alex");
		list.add("Anna");
		
		//Coletando os elementos de list que possuem o primeiro caractere "A"
		List<String> result = list.stream().filter( x -> x.charAt(0) == 'A' ).collect(Collectors.toList());
		//Cria-se uma nova lista
		//stream() é um tipo especial que aceita operações com expressões lambda
		//filter() recebe um predicado 
		//collect(Collectors.toList()) converte o valor coletado para Lista e armazena em result.
		
		for ( String elementos : result ) {
			System.out.println(elementos);
		}
		
		System.out.println("---------------");
		String name = list.stream().filter( x -> x.charAt(0) == 'A').findFirst().orElse( null );
		//findFirst() detecta o primeiro valor da lista que corresponde com o predicado.
		System.out.println(name);
	}

}
