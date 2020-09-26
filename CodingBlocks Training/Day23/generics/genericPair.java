package Lecture23.generics;

// here we'r able to resolve the data type reusability issue

public class genericPair<T> {

	// T can hold any kind of data type, so you don't need to specifically define
	// data type of objects/variables, make it generics using <T> convention
	// and pass your desired data type at run time
	
	T one;
	T two;
}
