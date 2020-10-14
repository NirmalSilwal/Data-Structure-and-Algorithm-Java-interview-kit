package facebookInterview;

import java.util.LinkedList;

public class LinkedListAdd2Integer {

	public static LinkedList<Integer> addTwoInteger(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> resultList = new LinkedList<Integer>();

		int list1pos = 0;
		int list2pos = 0;
		int list1size = list1.size();
		int list2size = list2.size();
		int carry = 0;

		while (list1pos != list1size && list2pos != list2size) {
			int sum = list1.get(list1pos) + list2.get(list2pos) + carry;
			if (sum < 10) {
				resultList.addLast(sum);
				list1pos++;
				list2pos++;
			} else {
				int rem = sum % 10;
				carry = sum / 10;
				resultList.addLast(rem);
				list1pos++;
				list2pos++;
			}
		}

		while (list1pos != list1size) {
			int sum = list1.get(list1pos) + carry;
			if (sum < 10) {
				resultList.addLast(sum);
				list1pos++;
			} else {
				int rem = sum % 10;
				carry = sum / 10;
				resultList.addLast(rem);
				list1pos++;
			}
		}

		while (list2pos != list2size) {
			int sum = list2.get(list2pos) + carry;
			if (sum < 10) {
				resultList.addLast(sum);
				list2pos++;
			} else {
				int rem = sum % 10;
				carry = sum / 10;
				resultList.addLast(rem);
				list2pos++;
			}
		}

		if (carry > 0) {
			resultList.addLast(carry);
		}
		
		return resultList;
	}

	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<Integer>();

		list1.addLast(1);
		list1.addLast(0);
		list1.addLast(9);
		list1.addLast(9);

		LinkedList<Integer> list2 = new LinkedList<Integer>();

		list2.addLast(7);
		list2.addLast(3);
		list2.addLast(2);

		System.out.println("Given list are:");
		System.out.println(list1);
		System.out.println(list2);

		LinkedList<Integer> answerList = addTwoInteger(list1, list2);

		System.out.println("\nlist having resulting sum with carry is: ");
		System.out.println(answerList);
	}

}


/* problem statement:

Given the head pointers of two linked lists where each linked list represents an integer number
(each node is a digit), add them and return the resulting linked list.

output:
------
Given list are:
[1, 0, 9, 9]
[7, 3, 2]

list having resulting sum with carry is: 
[8, 3, 1, 0, 1]
*/