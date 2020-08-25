package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		
		String path = "/home/yvescesar/Documents/Curso_JAVA/files-test/out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //new FileWriter(path, true) garante que não irá recriar o arquivo, e sim acrescentar
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
