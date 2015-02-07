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
		int[] code = {2, 7, 15};
		int i = 0;
		while(s.hasNextLine()) {
			String line = s.nextLine();
			for (int j = 0; j < line.length(); j++) {
				if (Character.isLetter(line.charAt(j))) {
					char c = Character.toLowerCase(line.charAt(j));
					System.out.print((char)(((c-'a')+code[i]) % 26 + 'a'));
					i++;
					i %= 3;				
				} else {
					System.out.print(line.charAt(j));
				}
			}
			System.out.println();
		}
	}
}