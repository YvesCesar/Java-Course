package application;

import java.io.File;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Mostrar todas as pastas de um diretório:
		File[] folders = path.listFiles(File::isDirectory); //File::isDirectory é uma sintaxe de referenced methods(referência a métodos)
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Mostrar todos os arquivos de um diretório:
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		// Criando uma subpasta a partir de um diretório:
		boolean success = new File(strPath + "/subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		sc.close();
	}

}
