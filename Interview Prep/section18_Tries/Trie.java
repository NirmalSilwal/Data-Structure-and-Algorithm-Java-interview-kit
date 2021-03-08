package section18_Tries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Trie {

	private class Node {
		char data;
		HashMap<Character, Node> children;
		boolean isTerminal;

		Node(char data, boolean isTerminal) {
			this.data = data;
			this.children = new HashMap<>();
			this.isTerminal = isTerminal;
		}
	}

	private int numWords;
	private Node root;

	Trie() {
		this.root = new Node('\0', false);
		this.numWords = 0;
	}

	public int numWords() {
		return this.numWords;
	}

	public void addWord(String word) {
		this.addWord(root, word);
	}

	// O(k) Time, where k is length of word
	private void addWord(Node parent, String word) {

		if (word.length() == 0) {
			if (parent.isTerminal == true) {
				// word already exists
			} else {
				parent.isTerminal = true;
				this.numWords++;
			}
			return;
		}

		char cc = word.charAt(0);
		String ros = word.substring(1);

		Node child = parent.children.get(cc);

		if (child == null) {
			child = new Node(cc, false);
			parent.children.put(cc, child);
		}

		this.addWord(child, ros);
	}

	public void display() {
		this.display(this.root, "");
	}

	private void display(Node node, String outputSoFar) {

		if (node.isTerminal) {
			String resultWord = outputSoFar.substring(1) + node.data;
			System.out.println(resultWord);
		}

		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();

		for (Map.Entry<Character, Node> entry : entries) {
			this.display(entry.getValue(), outputSoFar + node.data);
		}
	}

	// O(k) Time, where k is length of word
	public boolean search(String word) throws Exception {
		if (word.length() == 0)
			throw new Exception("empty string...");

		return search(this.root, word);
	}

	private boolean search(Node node, String word) {

		if (node.isTerminal && word.length() == 0)
			return true;

		char cc = word.charAt(0);
		String restOfString = word.substring(1);

		Node child = node.children.get(cc);

		if (child == null) {
			return false;
		}

		return this.search(child, restOfString);
	}

	// O(k) Time, where k is length of word
	public void remove(String word) {
		this.remove(this.root, word);
	}

	private void remove(Node node, String word) {

		if (word.length() == 0) {
			if (node.isTerminal) {
				node.isTerminal = false;
				this.numWords--;
			} else {
				// word is a part of some other word
			}
			return;
		}
		char cc = word.charAt(0);
		String restOfString = word.substring(1);

		Node child = node.children.get(cc);

		if (child == null) {
			return;
		}

		this.remove(child, restOfString);

		if (!child.isTerminal && child.children.size() == 0) {
			node.children.remove(cc);
		}
	}
}
