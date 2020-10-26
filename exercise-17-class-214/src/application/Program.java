package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import entities.Candidate;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String strFile = sc.nextLine();
		//  /home/yvescesar/Workspaces-JAVA/ws-curso-java/exercise-17-class-214/candidates.txt
		
		File path = new File(strFile);
		
		Set<Candidate> candidates = new TreeSet<>();
		Map<Candidate, Integer> ranking = new TreeMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				candidates.add(new Candidate(fields[0], Integer.parseInt(fields[1])));
				line = br.readLine();
			}
			
			
			for (Candidate candidate : candidates) {
				ranking.put(candidate, candidate.getVotes());
			}
			
			for (Candidate candidate : ranking.keySet()) {
				System.out.println(candidate);
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();
	}

}
