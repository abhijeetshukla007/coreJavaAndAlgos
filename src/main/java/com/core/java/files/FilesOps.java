package com.core.java.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesOps {
	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new FileReader("bands.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("data.txt"));
		FileWriter writer = new FileWriter(new File("result.txt"));
		String line1 = "";
		String line2 = "";
		while ((line1 = br1.readLine()) != null && (line2 = br2.readLine()) != null) {
			writer.write(line1 + "," + line2 + "\n");
		}
		writer.flush();
		writer.close();
	}
}
