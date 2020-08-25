package application;

import java.io.File;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		System.out.println("getName: " + path.getName()); // Retorna o nome do arquivo
		System.out.println("getParent: " + path.getParent());// Retorna o caminho, sem o nome do arquivo
		System.out.println("getPath: " + path.getPath());// Retorna todo o caminho.

		sc.close();
	}

}
