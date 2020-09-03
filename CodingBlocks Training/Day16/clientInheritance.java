package Lecture16;

public class clientInheritance {

	public static void main(String[] args) {

		// part 1
		parentInheritance obj = new parentInheritance();

		System.out.println(obj.age);
		obj.read();
		obj.sing();
		
		System.out.println("===========================================");
		// part2
		parentInheritance obj2 = new ChildInheritance(); // parent can hold child reference
		
		System.out.println(obj2.age);  // dynamic polymorphism
		// exceptional case(parent holding child): in case of variable, obj2 will show parent value
		// if it was method, it would be overwritten 
		
		System.out.println(obj2.rollno);
//		System.out.println(obj2.name); // name cannot be resolved or is not a field
		
		// compiler will check name variable in parent class i.e parentInheritance here,
		// as name is not present in parent class, compiler will throw compile time error.
		// new ChildInheritance() - this part is checked by JRE 
		// parentInheritance obj2 - this part is checked by compiler
		
		obj2.sing();
		obj2.read();
//		obj2.write(); // The method write() is undefined for the type parentInheritance
		
		// similar to above, here write() is not present in parent class as obj2 
		// reference is hold by parent class, and compiler will check the presence of write()
		// method in parent class during compilation, as it don't find there, it gives error
		// to access child class write(), you need to hold obj2 reference by child class itself here
		
		System.out.println("===========================================");
		// part3
		
		ChildInheritance obj3 = new ChildInheritance();
		
		System.out.println(obj3.age); // here age will also be overwritten
		// unlike above exceptional case with variable, here reference is of same class as right side
		// here - child holds child reference so it is overwritten
		
		System.out.println(obj3.name);
		System.out.println(obj3.rollno);
		
		obj3.sing();
		obj3.read();
		obj3.write();
	}

}


/* output:
40
Inside parent read method
Inside parent sing menthod
===========================================
40
7
Inside parent sing menthod
Inside child read method
===========================================
20
Trishna
7
Inside parent sing menthod
Inside child read method
Inside child write method
*/