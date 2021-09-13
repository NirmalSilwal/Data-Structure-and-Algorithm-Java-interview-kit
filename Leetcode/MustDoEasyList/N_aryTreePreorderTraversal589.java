package MustDoEasyList;

import java.util.ArrayList;
import java.util.List;

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
}

public class N_aryTreePreorderTraversal589 {

	public List<Integer> answer = new ArrayList<Integer>();

	public List<Integer> preorder(Node root) {

		if (root == null)
			return answer;

		answer.add(root.val);

		for (Node node : root.children) {
			preorder(node);
		}

		return answer;
	}
}
