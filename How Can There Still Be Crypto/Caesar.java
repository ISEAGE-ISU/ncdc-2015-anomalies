import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Caesar {
	public static void main(String args[]) {
		File file = new File(args[0]);
		Scanner s;
		try {
			s = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			return;
		}
		int[] code = {20, 70, 150};
		int i = 0;
		while(s.hasNextLine()) {
			String line = s.nextLine();
			for (int j = 0; j < line.length(); j++) {
				System.out.print((char)((line.charAt(j)+code[i]) % 256));
				i++;
				i %= 3;				
			}
			System.out.println();
		}
	}
}