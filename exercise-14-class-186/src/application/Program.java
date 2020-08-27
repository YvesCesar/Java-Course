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

import entities.OutputFormat;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file path: ");
		String strFile = sc.nextLine();
		File inFile = new File(strFile);
		List<String> inputLines = new ArrayList<>();
		
		System.out.println();
		try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
			//Input:
			String line = br.readLine();
			
			System.out.println("Source file:");
			while(line != null) {
				inputLines.add(line);
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println();
		
		// Output:
		new File(inFile.getParent() + "/out/").mkdir();
		File outFile = new File("/home/yvescesar/Documents/Curso_JAVA/files-test/out/summary.csv");
		
		List<OutputFormat> opf =  new ArrayList<>();
		
		for (String line : inputLines) {
			String[] lineVect = line.split(",");
			String name = lineVect[0];
			Double price = Double.parseDouble(lineVect[1]);
			Integer quantity = Integer.parseInt(lineVect[2]);
			
			opf.add(new OutputFormat(name, price, quantity));
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
			for (OutputFormat line : opf) {
				bw.write(line.toString());
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