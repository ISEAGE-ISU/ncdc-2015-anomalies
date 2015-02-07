import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SubstitutionWord {
	public static void main(String args[]) {
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Boolean> duplicate = new ArrayList<Boolean>();
		File file = new File("poem.txt");
		Scanner s;
		try {
			s = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			return;
		}
		while(s.hasNext()) {
			String next = s.next();
			next = removePunctuation(next);
			int a = contains(words, next);
			if (a == -1) {
				words.add(next);
				duplicate.add(false);
			} else {
				duplicate.set(a, true);
			}
		}
		int count = 0;
		String[] subs = new String[54];
		boolean[] first = new boolean[26];
		for (int i = 0; i < words.size(); i++) {
			if (!duplicate.get(i) && words.get(i).length() > 4) {
				subs[count] = words.get(i);
				count++;
			}
		}

		file = new File("answer.txt");
		Scanner s2;
		try {
			s2 = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			return;
		}
		while (s2.hasNextLine()) {
			String line = s2.nextLine();
			for (int i = 0; i < line.length(); i++) {
				if (Character.isLetter(line.charAt(i))) {
					if (Character.isLowerCase(line.charAt(i))) {
						int index = line.charAt(i)-'a';
						int index2 = index;
						if (first[index]) {
							index2 += 26;
						}
						first[index] = !first[index];
						System.out.print(subs[index2] + " ");
					} else {
						int index = line.charAt(i)-'A';
						int index2 = index;
						if (first[index]) {
							index2 += 26;
						}
						first[index] = !first[index];
						System.out.print(subs[index2] + " ");
					}
				} else {
					System.out.print(line.charAt(i));
				}
			}
			System.out.println();
		}

	}
	
	private static int contains(ArrayList words, String word) {
		for(int i = 0; i < words.size(); i++) {
			if (words.get(i).equals(word)) {
				return i;
			}
		}
		return -1;
	}

	private static String removePunctuation(String word) {
		return word.replaceAll("[';:,.-]", "");
	}
}