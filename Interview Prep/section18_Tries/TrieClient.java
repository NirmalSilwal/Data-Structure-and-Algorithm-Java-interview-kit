package section18_Tries;

public class TrieClient {

	public static void main(String[] args) throws Exception {

		Trie trie = new Trie();

		trie.addWord("arts");
		trie.addWord("art");
		trie.addWord("bug");
		trie.addWord("boy");
		trie.addWord("amit");
		trie.addWord("see");
		trie.addWord("sea");
		trie.addWord("seen");

		trie.display();

		System.out.println("\nSEARCHING...");
		System.out.println(trie.search("boy"));
		System.out.println(trie.search("bug"));
		System.out.println(trie.search("arts"));
		System.out.println(trie.search("art"));
		System.out.println(trie.search("amit"));
		System.out.println(trie.search("sea"));
		System.out.println(trie.search("seen"));
		System.out.println(trie.search("see"));

		// System.out.println(trie.search(""));
		System.out.println(trie.search("arte"));
		System.out.println(trie.search("seens"));
		System.out.println(trie.search("nirmal"));
		System.out.println(trie.search("boi"));

		System.out.println("\nREMOVING...\n");
		trie.remove("arts");
		trie.display();

		System.out.println("\nREMOVING...\n");
		trie.remove("art");
		trie.display();
	}

}


/* output:

art
arts
amit
bug
boy
sea
see
seen

SEARCHING...
true
true
true
true
true
true
true
true
false
false
false
false

REMOVING...

art
amit
bug
boy
sea
see
seen

REMOVING...

amit
bug
boy
sea
see
seen

*/