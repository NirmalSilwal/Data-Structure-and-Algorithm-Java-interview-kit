package section18_Tries;

import java.util.BitSet;

public class HuffmanEncoderClient {

	public static void main(String[] args) throws Exception {

		String str = "abbcdda";
		System.out.println("original string: " + str);
		System.out.println("size of original string is: " + str.length() * 2 + " bytes");

		HuffmanEncoder huffman = new HuffmanEncoder(str);

		String encoded = huffman.encode(str);
		System.out.println("encoded string: " + encoded);

		String decoded = huffman.decode(encoded);
		System.out.println("decoded string: " + decoded);

		System.out.println(str.equals(decoded));

		BitSet bitset = new BitSet(encoded.length());
		int bitcounter = 0;

		for (Character ch : encoded.toCharArray()) {
			if (ch == '1') {
				bitset.set(bitcounter);
			}
			bitcounter++;
		}

		byte[] arr = bitset.toByteArray();
		System.out.println("size of encoded string is: " + arr.length + " bytes");
	}

}

/*
 * output:
 * 
 * original string: abbcdda encoded string: 00001011001001000 decoded string:
 * abbcdda true
 */