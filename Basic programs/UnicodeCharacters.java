package practice;

public class UnicodeCharacters {

	public static void main(String[] args) {

		System.out.println("displaying Nepali characters:\n");

		for (char ch = 0x0915; ch <= 0x0939; ch++) {
			System.out.print(ch + "  ");
		}
	}

}
