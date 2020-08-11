package Lecture11;

public class printKeypadCodes {

	public static void main(String[] args) {

		String code = "123";
		String result = "";

		printAllKeypadCodes(code, result);
	}

	public static void printAllKeypadCodes(String str, String result) {
		if (str.length() == 0){
			System.out.println(result);
			return;
		}

		char fc = str.charAt(0);
		String rest = str.substring(1);

		String code = getCode(fc);

		for (int i = 0; i < code.length(); i++) {
			char letter = code.charAt(i);
			printAllKeypadCodes(rest, result + letter);
		}
	}

	public static String getCode(char firstChar) {
		if (firstChar == '1') {
			return "abc";
		}
		if (firstChar == '2') {
			return "def";
		}
		if (firstChar == '3') {
			return "ghi";
		}
		if (firstChar == '4') {
			return "jkl";
		}
		if (firstChar == '5') {
			return "mno";
		}
		if (firstChar == '6') {
			return "pqr";
		}
		if (firstChar == '7') {
			return "stu";
		}
		if (firstChar == '8') {
			return "vwx";
		}
		if (firstChar == '9') {
			return "yz";
		}

		return "";
	}
}

/*
 *output:
adg
adh
adi
aeg
aeh
aei
afg
afh
afi
bdg
bdh
bdi
beg
beh
bei
bfg
bfh
bfi
cdg
cdh
cdi
ceg
ceh
cei
cfg
cfh
cfi
 */