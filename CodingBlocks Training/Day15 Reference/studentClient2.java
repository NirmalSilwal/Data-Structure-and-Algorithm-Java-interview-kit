package OOPS;

public class studentClient2 {

	public static void main(String[] args) {

		System.out.println("hello... executing");
		student2 s1 = new student2();

		try {
			s1.setAge(-10);
			System.out.println("after set statement");
		} catch (Exception e) {
			System.out.println("in catch block: can't set age negative");
		}

		System.out.println("bye bye!");
	}

}

/*
 * output: hello... executing 
 * in catch block: can't set age negative 
 * bye bye!
 */