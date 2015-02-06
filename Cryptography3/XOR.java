import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class XOR {
	public static void main(String args[]) {
		File file = new File(args[0]);
		Scanner s;
		try {
			s = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			return;
		}
		String code = "brand";
		int length = 4;
		int index = 0;
		while (s.hasNextLine()) {
			String line = s.nextLine();
			line += "\n";
			for (int i = 0; i < line.length(); i++) {
				System.out.print((char)(line.charAt(i)^code.charAt(index)));
				index++;
				if (index >= length) {
					index -= length;
				}
			}
		}
	}
}