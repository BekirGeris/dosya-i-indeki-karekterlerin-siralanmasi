package Býolum12Soru12;

import java.io.*;
import java.util.*;

public class SortedString21 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("SortedString.txt");
		if (file.exists() == false) {
			file.createNewFile();
		}
		ArrayList<String> list = new ArrayList<>();
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			list.add(input.next());
		}
		
		input.close();
		Collections.sort(list);
		
		File file2 = new File("SortedString2.txt");
		if (file2.exists() == false) {
			file2.createNewFile();
		}
		System.out.println(file2.exists());
		System.out.println(file2.getAbsolutePath());
		
		try (
			PrintWriter output = new PrintWriter(file2);
		)  {
			for (String string : list) {
				output.print(string + " ");
			}
		}
		System.out.println(list);
	}

}
