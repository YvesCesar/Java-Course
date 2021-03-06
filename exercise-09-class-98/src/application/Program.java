/*
 * Fazer um programa para ler dois números inteiros M e N, e depois ler
 *uma matriz de M linhas por N colunas contendo números inteiros,
 *podendo haver repetições. Em seguida, ler um número inteiro X que
 *pertence à matriz. Para cada ocorrência de X, mostrar os valores à
 *esquerda, acima, à direita e abaixo de X, quando houver
 * 
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		//MxN
		Integer[][] matrix = new Integer[M][N];
		
		
		//Preenchendo matriz:
		for ( int i = 0; i < matrix.length; i++ )  
		{
			for ( int j = 0; j < matrix[i].length; j++ )
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		
		//Lendo um número inteiro:
		int X = sc.nextInt();
		
		for ( int i = 0; i < matrix.length; i++ ) {
			for ( int j = 0; j < matrix[i].length; j++ ) {
				//Procurando ocorrências:
				if ( matrix[i][j] == X ) {
					System.out.println("Position " + i + "," + j);
					
					//Left, Só terá lado esquerdo se j > 0
					if ( j > 0 ) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}
					//Right, só não vai ter lado direito se o elemento pertencer à última coluna:
					if ( j < matrix[i].length - 1 ) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}
					//Up, Caso i > 0
					if ( i > 0) {
						System.out.println("Up: " + matrix[i - 1 ][j]);
					}
					//Down, caso i não seja o último
					if ( i < matrix.length - 1 ) {
						System.out.println("Down: " + matrix[i + 1 ][j]);
					}
					
				}
			}
		}
		
		
		
		sc.close();

	}

}
