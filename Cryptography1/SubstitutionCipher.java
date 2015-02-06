import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SubstitutionCipher {
	public static void main(String args[]) {
		String sub = "aebqpcjslghwdxvkniroztfyum";
		File file = new File("grading.md");
		Scanner s;
		try {
			s = new Scanner(file);	
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			return;
		}

		while (s.hasNextLine()) {
			String str = s.nextLine();
			char[] arr = str.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				if (Character.isLetter(arr[i])) {
					if (Character.isLowerCase(arr[i])) {
						arr[i] = sub.charAt(arr[i] - 'a');
					} else {
						arr[i] = Character.toUpperCase(sub.charAt(arr[i]-'A'));
					}
				}
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}
}