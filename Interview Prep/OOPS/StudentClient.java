package OOPS;

public class StudentClient {

	public static void main(String[] args) {

		// here s is the reference
		Student s = new Student();
		System.out.println(s); // OOPS.Student@1db9742

		System.out.println(s.name); // null
		System.out.println(s.age); // 0

		s.name = "Nirmal";
		s.age = 24;

		System.out.println(s.name); // Nirmal
		System.out.println(s.age); // 24

		// creating new reference, note that it is not instance below
		// here s1 points to the same reference as of s
		Student s1 = s;

		s1.name = "Clement";
		System.out.println(s.name); // Clement

		Student ref1 = new Student();
		ref1.name = "reference1";
		ref1.age = 1;

		Student ref2 = new Student();
		ref2.name = "reference2";
		ref2.age = 2;

		testReferences(ref1, ref2);
		System.out.println("\nname: " + ref1.name + " age: " + ref1.age);
		System.out.println("name: " + ref2.name + " age: " + ref2.age);

	}

	public static void testReferences(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}

}

/* output:
OOPS.Student@1db9742
null
0
Nirmal
24
Clement

name: reference1 age: 1
name: reference2 age: 2
*/