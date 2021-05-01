package section24_BinaryTree;

import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {

	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree() {
		this.root = takeInput(null, false);
	}

	// parameterized constructor for tree construction using preorder and
	// inorder traversal
	public BinaryTree(int[] inTraverse, int[] preTraverse) {

		int inStartIdx = 0, inEndIdx = inTraverse.length - 1;
		int preStartIdx = 0, preEndIdx = preTraverse.length - 1;

		this.root = construct(preTraverse, preStartIdx, preEndIdx, inTraverse, inStartIdx, inEndIdx);
	}

	private Node takeInput(Node parent, boolean isLeftChild) {

		// prompt
		if (parent == null) {
			System.out.println("Enter the data for root node: ");
		} else {
			if (isLeftChild)
				System.out.println("Enter the data for left child of " + parent.data);
			else
				System.out.println("Enter the data for right child of " + parent.data);
		}

		// take input of data
		int item = sc.nextInt();
		// create new Node
		Node newNode = new Node();
		newNode.data = item;

		System.out.println("Do you have left child of " + newNode.data + " ?, press Y/N");
		char hasLeft = sc.next().charAt(0);

		// if left child exists, create it
		if (hasLeft == 'Y') {
			newNode.left = takeInput(newNode, true);
		}

		System.out.println("Do you have right child of " + newNode.data + " ?, press Y/N");
		char hasRight = sc.next().charAt(0);

		// if right child exists, create it
		if (hasRight == 'Y') {
			newNode.right = takeInput(newNode, false);
		}

		// node is ready
		return newNode;
	}

	// O(N)Time
	public void display() {
		System.out.println("\n--------------------");
		display(root);
		System.out.println("--------------------");
	}

	private void display(Node node) {
		// base case
		if (node == null)
			return;

		// self-work
		String str = "";

		if (node.left != null)
			str += node.left.data;
		else
			str += ". ";

		str += " => " + node.data + " <= ";

		if (node.right != null)
			str += node.right.data;
		else
			str += '.';

		System.out.println(str);

		// smaller problems
		display(node.left);
		display(node.right);
	}

	// O(N)Time
	public int size() {
		return size(root);
	}

	private int size(Node node) {
		if (node == null)
			return 0;

		int lsize = size(node.left);
		int rsize = size(node.right);

		return lsize + rsize + 1;
	}

	// O(N)Time
	public int max() {
		return max(root);
	}

	/*
	 * private int max(Node node) {
	 * 
	 * int totalMax = node.data;
	 * 
	 * if (node.left != null) { int lmax = max(node.left);
	 * 
	 * if (lmax > totalMax) totalMax = lmax; }
	 * 
	 * if (node.right != null) { int rmax = max(node.right);
	 * 
	 * if (rmax > totalMax) totalMax = rmax; }
	 * 
	 * return totalMax; }
	 */

	// clean code to find max
	private int max(Node node) {
		if (node == null)
			return Integer.MIN_VALUE;

		int lmax = max(node.left);
		int rmax = max(node.right);

		return Math.max(node.data, Math.max(lmax, rmax));
	}

	// O(N)Time
	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null)
			return false;

		if (node.data == item)
			return true;

		boolean lResult = find(node.left, item);
		if (lResult)
			return true;

		boolean rResult = find(node.right, item);
		if (rResult)
			return true;

		return false;
	}

	// O(N)Time
	public int height() {
		return height(root);
	}

	private int height(Node node) {
		if (node == null)
			return -1;

		int lheight = height(node.left);
		int rheight = height(node.right);

		return Math.max(lheight, rheight) + 1; // self-work
	}

	// approach 1 - using global variable
	private int diameterAns = Integer.MIN_VALUE;

	public int diameter() {
		diameter(root);
		return diameterAns;
	}

	private void diameter(Node node) {

		if (node == null) {
			return;
		}

		int presentNodeRoot = height(node.left) + height(node.right) + 2;

		if (presentNodeRoot > diameterAns) {
			diameterAns = presentNodeRoot;
		}

		diameter(node.left);
		diameter(node.right);
	}

	// approach 2
	// O(N^2)Time
	public int diameter2() {
		return diameter2(root);
	}

	private int diameter2(Node node) {

		if (node == null)
			return 0;

		// max distance between 2 leaf nodes might lie in left subtree,
		// factor1: left diameter
		int lDiameter = diameter2(node.left);

		// max distance between 2 leaf nodes might lie in right subtree,
		// factor2: right diameter
		int rDiameter = diameter2(node.right);

		// self node might be the root node of diameter, factor3: self diameter
		int rootDiameter = height(node.left) + height(node.right) + 2;

		return Math.max(rootDiameter, Math.max(lDiameter, rDiameter));
	}

	private class DiaPair {
		int pairDiameter = 0;
		int pairHeight = -1;
	}

	public int diameter3() {
		DiaPair ansPair = diameter3(root);
		return ansPair.pairDiameter;
	}

	private DiaPair diameter3(Node node) {

		if (node == null) {
			return new DiaPair();
		}

		DiaPair leftDiaPair = diameter3(node.left);
		DiaPair rightDiaPair = diameter3(node.right);

		DiaPair selfDiaPair = new DiaPair();

		int lDiameter = leftDiaPair.pairDiameter;
		int rDiameter = rightDiaPair.pairDiameter;
		int selfDiameter = leftDiaPair.pairHeight + rightDiaPair.pairHeight + 2;

		selfDiaPair.pairDiameter = Math.max(selfDiameter, Math.max(lDiameter, rDiameter));
		selfDiaPair.pairHeight = Math.max(leftDiaPair.pairHeight, rightDiaPair.pairHeight) + 1;

		return selfDiaPair;
	}

	// O(N^2) Time
	public boolean isBalanced() {
		return isBalanced(root);
	}

	private boolean isBalanced(Node node) {

		if (node == null) {
			return true;
		}

		boolean leftBalanced = isBalanced(node.left);
		boolean rightBalanced = isBalanced(node.right);

		// for root node of current subtree
		int balancingFactor = height(node.left) - height(node.right);

		if (leftBalanced && rightBalanced && balancingFactor >= -1 && balancingFactor <= 1) {
			return true;
		} else {
			return false;
		}
	}

	// Efficient approach to check if binary tree is Balanced

	private class BalPair {
		boolean isBal = true;
		int ht = -1;
	}

	// O(N) Time
	public boolean isBalanced3() {
		BalPair ans = isBalanced3(root);
		return ans.isBal;
	}

	private BalPair isBalanced3(Node node) {

		if (node == null) {
			return new BalPair();
		}

		BalPair leftBalPair = isBalanced3(node.left);
		BalPair rightBalPair = isBalanced3(node.right);

		BalPair selfBalPair = new BalPair();

		// logic from first approach
		boolean leftBalanced = leftBalPair.isBal;
		boolean rightBalanced = rightBalPair.isBal;
		int balancingFactor = leftBalPair.ht - rightBalPair.ht;

		if (leftBalanced && rightBalanced && balancingFactor >= -1 && balancingFactor <= 1) {
			selfBalPair.isBal = true;
		} else {
			selfBalPair.isBal = false;
		}

		selfBalPair.ht = Math.max(leftBalPair.ht, rightBalPair.ht) + 1;

		return selfBalPair;
	}

	// Binary Tree Traversals

	public void preorder() {
		preorder(root);
	}

	private void preorder(Node node) {
		if (node == null)
			return;

		// NLR - Node, Left, Right
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);
	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(Node node) {
		if (node == null)
			return;

		// LNR, Left, Node, Right
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(Node node) {
		if (node == null)
			return;

		// LRN, Left, Right, Node
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
	}

	// pre-order traversal using Iterative approach
	private class Pair {
		Node node;
		boolean selfDone; // Node traversed
		boolean leftDone; // Left traversed
		boolean rightDone; // Right traversed
	}

	public void preorderIterative() {

		// create a Stack
		Stack<Pair> stack = new Stack<>();

		// create starting pair
		Pair startPair = new Pair();
		startPair.node = root;

		// put starting pair in Stack
		stack.push(startPair);

		while (!stack.isEmpty()) {

			Pair topmostPair = stack.peek();

			if (topmostPair.node == null) {
				stack.pop();
				continue;
			}

			if (topmostPair.selfDone == false) {
				System.out.print(topmostPair.node.data + " "); // N
				topmostPair.selfDone = true;

			} else if (topmostPair.leftDone == false) {

				// create a new pair
				Pair newLPair = new Pair();
				newLPair.node = topmostPair.node.left; // L

				// if (newLPair.node != null)
				stack.push(newLPair);

				topmostPair.leftDone = true;

			} else if (topmostPair.rightDone == false) {

				Pair newRPair = new Pair();
				newRPair.node = topmostPair.node.right; // R

				// if (newRPair.node != null)
				stack.push(newRPair);

				topmostPair.rightDone = true;
			} else {
				stack.pop();
			}
		}
	}

	public int sum() {
		return sum(root);
	}

	private int sum(Node node) {

		if (node == null) {
			return 0;
		}

		int leftSum = sum(node.left);
		int rightSum = sum(node.right);

		return leftSum + rightSum + node.data;
	}

	// maximum subtree sum

	// approach 1 - using global variable
	/*
	 * private int maxSubsumAns = Integer.MIN_VALUE;
	 * 
	 * public int maxSubtreeSum1() { maxSubtreeSum1(root); return maxSubsumAns;
	 * }
	 * 
	 * private void maxSubtreeSum1(Node node) {
	 * 
	 * if (node == null) return;
	 * 
	 * int lsum = sum(node.left); if (lsum > maxSubsumAns) { maxSubsumAns =
	 * lsum; } maxSubtreeSum1(node.left);
	 * 
	 * int rsum = sum(node.right); if (rsum > maxSubsumAns) { maxSubsumAns =
	 * rsum; } maxSubtreeSum1(node.right);
	 * 
	 * int currentSubtreesum = lsum + rsum + node.data;
	 * 
	 * if (currentSubtreesum > maxSubsumAns) { maxSubsumAns = currentSubtreesum;
	 * } }
	 */

	// clean code of maxSubtreeSum1()
	private int maxSubsumAns2 = Integer.MIN_VALUE;

	public int maxSubtreeSum1() {
		maxSubtreeSum1(root);
		return maxSubsumAns2;
	}

	private int maxSubtreeSum1(Node node) {

		if (node == null)
			return 0;

		int lsum = maxSubtreeSum1(node.left);
		int rsum = maxSubtreeSum1(node.right);

		int nodeans = lsum + rsum + node.data;

		if (nodeans > maxSubsumAns2) {
			maxSubsumAns2 = nodeans;
		}

		return nodeans;
	}

	// O(N^2) Time
	public int maxSubtreeSum2() {
		return maxSubtreeSum2(root);
	}

	// recursion returns maximum subtree sum
	private int maxSubtreeSum2(Node node) {

		if (node == null)
			return Integer.MIN_VALUE; // not zero, because node data can be
										// negative & we are finding Max value

		int lMaxSubtreeSum = maxSubtreeSum2(node.left);
		int rMaxSubtreeSum = maxSubtreeSum2(node.right);

		// current node sum + entire left subtree sum + entire right subtree sum
		// int selfSum = node.data + sum(node.left) + sum(node.right);
		int selfSum = sum(node);

		int ans = Math.max(selfSum, Math.max(lMaxSubtreeSum, rMaxSubtreeSum));

		return ans;
	}

	// approach 3

	private class MaxSubtreeSumPair {
		int entireSum = 0;
		int maxSubtreeSum = Integer.MIN_VALUE;
	}

	// O(N) Time
	public int maxSubtreeSum3() {
		return maxSubtreeSum3(root).maxSubtreeSum;
	}

	private MaxSubtreeSumPair maxSubtreeSum3(Node node) {

		if (node == null) {
			return new MaxSubtreeSumPair();
		}

		MaxSubtreeSumPair lp = maxSubtreeSum3(node.left);
		MaxSubtreeSumPair rp = maxSubtreeSum3(node.right);

		MaxSubtreeSumPair selfpair = new MaxSubtreeSumPair();

		selfpair.entireSum = lp.entireSum + rp.entireSum + node.data;
		selfpair.maxSubtreeSum = Math.max(selfpair.entireSum, Math.max(lp.maxSubtreeSum, rp.maxSubtreeSum));

		return selfpair;
	}

	public Node construct(int[] pre, int plow, int phigh, int[] in, int ilow, int ihigh) {

		if (plow > phigh || ilow > ihigh) {
			return null;
		}

		// create a new node with plow
		Node newNode = new Node();
		newNode.data = pre[plow]; // root node initially

		// search for pre[plow] in inorder array
		int searchIdx = -1;
		int numElements = 0;
		for (int i = ilow; i <= ihigh; i++) {
			if (pre[plow] == in[i]) {
				searchIdx = i;
				break;
			}
			numElements++;
		}

		// left and right child call
		newNode.left = construct(pre, plow + 1, plow + numElements, in, ilow, searchIdx - 1);
		newNode.right = construct(pre, plow + numElements + 1, phigh, in, searchIdx + 1, ihigh);

		return newNode;
	}

	public boolean flipEquivalent(BinaryTree other) {
		return flipEquivalent(this.root, other.root);
	}

	private boolean flipEquivalent(Node node1, Node node2) {

		// if both nodes are null, they are flip equivalent
		if (node1 == null && node2 == null) {
			return true;
		}
		// if either of node is null, they are not flip equivalent
		if (node1 == null || node2 == null) {
			return false;
		}

		if (node1.data != node2.data) {
			return false;
		}
		// case 1 - node is not flipped

		// left subtree of node1 & left subtree of node2
		boolean leftleft = flipEquivalent(node1.left, node2.left);
		// right subtree of node1 & right subtree of node2
		boolean rightright = flipEquivalent(node1.right, node2.right);

		if (leftleft && rightright)
			return true;
		
		// case 2 - node is flipped

		// left subtree of node1 & right subtree of node2
		boolean leftright = flipEquivalent(node1.left, node2.right);
		// right subtree of node1 & left subtree of node2
		boolean rightleft = flipEquivalent(node1.right, node2.left);

		return (leftleft && rightright) || (leftright && rightleft);
	}
}
