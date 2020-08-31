package Lecture15;

public class studentClient2 {

	public static void main(String[] args) {

		student2 obj = new student2("Shyam", 40);
		System.out.println(obj.getCurrentStudents()); // 1

		student2 obj2 = new student2("Ram", 20);
		System.out.println(obj.getCurrentStudents()); // 2

		// making list of students
		student2[] allStudents = new student2[10];

		for (int people = 0; people < allStudents.length; people++) {
			allStudents[people] = new student2(people + "th name", people);
			System.out.println(allStudents[people].getCurrentStudents()); 

		}

		System.out.println(allStudents[0].getName()); // 0th name
		System.out.println(allStudents[0].getRollno()); // 0
		
		System.out.println(obj.getCurrentStudents()); // 12
		System.out.println(allStudents[0].getCurrentStudents()); 

		System.out.println(obj.getMaxStudents()); // 50
		System.out.println(allStudents[0].getMaxStudents()); // 50
		
		System.out.println(allStudents[5].getUniformColor()); // RED
		
		// now setting uniform color for 5th student, it changes default uniform color for all students
		allStudents[5].setUniformColor("GREEN");
		
		System.out.println(allStudents[5].getUniformColor()); // GREEN
		System.out.println(allStudents[8].getUniformColor()); // GREEN


 
	}

}


/* output:
prameterized constructor initializing...
1
prameterized constructor initializing...
2
prameterized constructor initializing...
3
prameterized constructor initializing...
4
prameterized constructor initializing...
5
prameterized constructor initializing...
6
prameterized constructor initializing...
7
prameterized constructor initializing...
8
prameterized constructor initializing...
9
prameterized constructor initializing...
10
prameterized constructor initializing...
11
prameterized constructor initializing...
12
0th name
0
12
12
50
50
RED
GREEN
GREEN
*/