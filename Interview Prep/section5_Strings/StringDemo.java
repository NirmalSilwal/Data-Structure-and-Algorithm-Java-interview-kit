package section5_Strings;

public class StringDemo {

	public static void main(String[] args) {
		String s = "hello";
		s = "bye";
		System.out.println(s); // bye
		
		String s2 = "hello";
		String s3 = "hello";
		System.out.println(s2+ "," + s3);
		
		s3 = "sleep";
		System.out.println(s2+ "," + s3);

		System.out.println(s3.charAt(0));
		System.out.println(s3.charAt(1));
		System.out.println(s3.charAt(2));
		System.out.println(s3.charAt(3));
		System.out.println(s3.charAt(s3.length() - 1));
		System.out.println(s3.length());
		
		System.out.println(s2.substring(0));
		System.out.println(s2.substring(1, 3));
		System.out.println(s2.substring(3, 3));
		System.out.println(s2.substring(3));


	}

}
