package section15_InterfaceAndGenerics.genericClass;

public class Client {

	public static void main(String[] args) {

		Pair<Integer> pair = new Pair<Integer>();
		// one is of type Integer
		System.out.println(pair.one);
		// two is of type Integer
		System.out.println(pair.two);

		Pair<String> pair2 = new Pair<String>();
		// one is of type String
		System.out.println(pair2.one);
		// two is of type String
		System.out.println(pair2.two);

		PairTwo<Integer, String> pair3 = new PairTwo<Integer, String>();

		// one is of type Integer
		System.out.println(pair3.one);
		// two is of type String
		System.out.println(pair3.two);
	}

}
