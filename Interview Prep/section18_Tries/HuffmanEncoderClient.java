package section18_Tries;

public class HuffmanEncoderClient {

	public static void main(String[] args) throws Exception {

		String str = "abbcdda";
		System.out.println("original string: " + str);
		HuffmanEncoder huffman = new HuffmanEncoder(str);

		String encoded = huffman.encode(str);
		System.out.println("encoded string: " + encoded);

		String decoded = huffman.decode(encoded);
		System.out.println("decoded string: " + decoded);

		System.out.println(str.equals(decoded));
	}

}


/* output:

original string: abbcdda
encoded string: 00001011001001000
decoded string: abbcdda
true
*/