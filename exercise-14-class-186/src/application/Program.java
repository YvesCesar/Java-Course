package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file path: ");
		String strFile = sc.nextLine();
		File inFile = new File(strFile);
		List<String> lines = new ArrayList<>();
		
		System.out.println();
		try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
			//Input:
			String line = br.readLine();
			
			System.out.println("Input:");
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println();
		
		// Output:
		File outFile = new File(inFile + "/out");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter())) {
			
			System.out.println("Output:");
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
// /home/yvescesar/Documents/Curso_JAVA/files-test/file.csv