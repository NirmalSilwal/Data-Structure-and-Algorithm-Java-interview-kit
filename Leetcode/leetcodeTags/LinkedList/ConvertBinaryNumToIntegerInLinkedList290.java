package LinkedList;

public class ConvertBinaryNumToIntegerInLinkedList290 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public int getDecimalValue(ListNode head) {

		StringBuilder sb = new StringBuilder("");
		ListNode temp = head;

		while (temp != null) {
			sb.append(temp.val);
			temp = temp.next;
		}

//	 	long binaryValue = Long.parseLong(sb.toString());
//	    int decimal = getDecimalFromBinary(binaryValue);

		return Integer.parseInt(sb.toString(), 2);
	}

	/*
	 * private static int getDecimalFromBinary(Long binaryValue) { int total = 0;
	 * int power = 0;
	 * 
	 * while (binaryValue != 0) { long rem = binaryValue % 10; total += (rem *
	 * Math.pow(2, power++)); binaryValue /= 10; }
	 * 
	 * return total; }
	 */

	//2nd approach
	public int getDecimalValue2(ListNode head) {
		int ans = 0;
		ListNode temp = head;

		while (temp != null) {
			ans *= 2;
			ans += temp.val;
			temp = temp.next;
		}

		return ans;
	}
}
