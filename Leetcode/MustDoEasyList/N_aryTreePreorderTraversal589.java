package MustDoEasyList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

	// recursive solution
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

	public List<Integer> result = new ArrayList<Integer>();

	public List<Integer> preorderIterative(Node root) {

		if (root == null)
			return result;

		Stack<Node> stack = new Stack<Node>();
		stack.push(root);

		while (!stack.isEmpty()) {

			Node curr = stack.pop();
			result.add(curr.val);

			// inserting children of current node to stack in reverse order
			for (int i = curr.children.size() - 1; i >= 0; i--) {
				stack.push(curr.children.get(i));
			}
		}

		return result;
	}
}
