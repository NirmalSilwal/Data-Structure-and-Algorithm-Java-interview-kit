package section18_Tries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HuffmanEncoder {

	HashMap<Character, String> encoder;
	HashMap<String, Character> decoder;

	private class Node implements Comparable<Node> {
		Character data;
		int cost; // frequency of occurrences
		Node left;
		Node right;

		Node(char data, int cost) {
			this.data = data;
			this.cost = cost;
			this.left = null;
			this.right = null;
		}

		Node(Node left, Node right) {
			this.left = left;
			this.right = right;
		}

		@Override
		public int compareTo(Node other) {
			return this.cost - other.cost;
		}
	}

	public HuffmanEncoder(String feeder) throws Exception {

		// creating frequency map of given string
		HashMap<Character, Integer> frequencyMap = new HashMap<>();

		for (int i = 0; i < feeder.length(); i++) {
			char cc = feeder.charAt(i); // current character
			if (frequencyMap.containsKey(cc)) {
				frequencyMap.put(cc, frequencyMap.get(cc) + 1);
			} else {
				frequencyMap.put(cc, 1);
			}
		}

		// create minHeap of Trees
		HeapGeneric<Node> minHeap = new HeapGeneric<>(true);

		Set<Map.Entry<Character, Integer>> entries = frequencyMap.entrySet();

		for (Map.Entry<Character, Integer> entry : entries) {
			Node mynode = new Node(entry.getKey(), entry.getValue());
			minHeap.add(mynode);
		}

		// combine nodes until one node is left in heap

		while (minHeap.size() != 1) {
			Node minOne = minHeap.remove();
			Node minTwo = minHeap.remove();

			Node combined = new Node(minOne, minTwo);
			combined.data = '\0';
			combined.cost = minOne.cost + minTwo.cost;

			minHeap.add(combined);
		}

		// retrieve the final combined node
		Node fullTree = minHeap.remove();

		this.encoder = new HashMap<>();
		this.decoder = new HashMap<>();

		this.initEncoderDecoder(fullTree, "");
	}

	// filling encoder and decoder
	private void initEncoderDecoder(Node node, String outputSoFar) {
		if (node == null)
			return;

		if (node.left == null && node.right == null) {
			this.encoder.put(node.data, outputSoFar);
			this.decoder.put(outputSoFar, node.data);
		}

		this.initEncoderDecoder(node.left, outputSoFar + "0");
		this.initEncoderDecoder(node.right, outputSoFar + "1");
	}

	public String encode(String source) {
		String encoded = "";
		for (int i = 0; i < source.length(); i++) {
			String code = this.encoder.get(source.charAt(i));
			encoded += code;
		}

		return encoded;
	}

	public String decode(String codedString) {
		String decoded = "";
		String currentMatchedKey = "";

		for (int i = 0; i < codedString.length(); i++) {
			currentMatchedKey += codedString.charAt(i);
			if (this.decoder.containsKey(currentMatchedKey)) {
				decoded = decoded + this.decoder.get(currentMatchedKey);
				currentMatchedKey = "";
			}
		}
		return decoded;
	}
}
