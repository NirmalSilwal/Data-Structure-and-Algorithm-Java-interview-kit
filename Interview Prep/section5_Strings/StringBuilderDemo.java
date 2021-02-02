package section5_Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {

		System.out.println("----------");
		StringBuilder sblank = new StringBuilder();
		System.out.println(sblank);

		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);

		System.out.println(sb.length());

		sb.append('A');
		System.out.println(sb);
		sb.append("HELLO");
		System.out.println(sb);

		// sb = "hello"; // Type mismatch: cannot convert from String to
		// StringBuilder

		String s = "testing";
		StringBuilder sbuild = new StringBuilder(s);
		System.out.println(sbuild);

		sbuild.insert(2, 'E');
		System.out.println(sbuild);
		sbuild.insert(sbuild.length(), "END");
		System.out.println(sbuild);

		sbuild.setCharAt(1, 'O');
		System.out.println(sbuild);
		sbuild.setCharAt(sbuild.length() - 1, 'Z');
		System.out.println(sbuild);

		sbuild.delete(2, 5);
		System.out.println(sbuild);
		sbuild.deleteCharAt(0);
		System.out.println(sbuild);
		sbuild.deleteCharAt(sbuild.length() - 1);
		System.out.println(sbuild);
	}
}

/* output:

----------

hello
5
helloA
helloAHELLO
testing
teEsting
teEstingEND
tOEstingEND
tOEstingENZ
tOingENZ
OingENZ
OingEN
*/
