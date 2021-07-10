package practice;

public class Animal {

	public static void main(String[] args) {
		
		Dog dogy = new Dog("Shepard", 5);
		
		String ans = dogy.dogDetails();
		
		System.out.println(ans);
	}
}
