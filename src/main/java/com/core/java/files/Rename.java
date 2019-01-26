package com.core.java.files;

// Java program to illustrate 
// how to rename Multiple Files 
// together using single program 
import java.io.File;
import java.io.IOException;

public class Rename {

	public static void main(String[] argv) throws IOException {
		// Path of folder where files are located
		String folder_path = "C:\\Users\\abhij\\git\\tracker-latest\\data\\tracker\\intents";

		// creating new folder
		getIntents(folder_path);
		// getSmallTalkStories(folder_path);
	}

	private static void getIntents(String folder_path) {
		File myfolder = new File(folder_path);

		File[] file_array = myfolder.listFiles();
		for (int i = 0; i < file_array.length; i++) {

			if (file_array[i].isFile()) {
				File myfile = new File(folder_path + "\\" + file_array[i].getName());
				String long_file_name = file_array[i].getName();
				if (long_file_name.contains("en-")) {
					myfile.delete();
				}else if(long_file_name.contains("small"))
				System.out.println(" - utter_" + long_file_name.substring(0, long_file_name.length() - 5));

			}
		}
	}

	/**
	 * @param folder_path
	 */
	private static void getSmallTalkStories(String folder_path) {
		File myfolder = new File(folder_path);

		File[] file_array = myfolder.listFiles();
		for (int i = 0; i < file_array.length; i++) {

			if (file_array[i].isFile()) {
				File myfile = new File(folder_path + "\\" + file_array[i].getName());
				String long_file_name = file_array[i].getName();
				// String[] tokens = long_file_name.split("\\s");
				// String new_file_name = tokens[1];
				if (long_file_name.contains("small") && !long_file_name.contains("usersays")) {
					System.out.println("## SMALL TALK STORY " + i);
					System.out.println(" * " + long_file_name.substring(0, long_file_name.length() - 5));
					System.out.println("    - utter_" + long_file_name.substring(0, long_file_name.length() - 5));
					System.out.println();

				}

				// System.out.print("new filename::" + long_file_name);

				// file name format: "Snapshot 11 (12-05-2017 11-57).png"
				// To Shorten it to "11.png", get the substring which
				// starts after the first space character in the long
				// _file_name.
				// myfile.renameTo(new File(folder_path + "\\" + long_file_name));
			}
		}
	}
}