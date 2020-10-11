package facebookInterview;

//time complexity: O(n)

import java.util.ArrayList;

class Pair {
	int first;
	int second;

	Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}
}

public class mergeOverlappingIntervals {

	public static ArrayList<Pair> mergeIntervals(ArrayList<Pair> allpairs) {

		if (allpairs == null || allpairs.size() == 0) {
			return null;
		}
		ArrayList<Pair> result = new ArrayList<Pair>();
		// write your code here
		result.add(new Pair(allpairs.get(0).first, allpairs.get(0).second));

		for (int i = 1; i < allpairs.size(); i++) {
			int start1 = allpairs.get(i).first;
			int end1 = allpairs.get(i).second;
			int end2 = result.get(result.size() - 1).second;

			if (end2 >= start1) {
				result.get(result.size() - 1).second = Math.max(end2, end1);
			} else {
				result.add(new Pair(start1, end1));
			}
		}

		return result;
	}

	public static void main(String[] args) {

		ArrayList<Pair> list = new ArrayList<Pair>();

		list.add(new Pair(1, 5));
		list.add(new Pair(3, 7));
		list.add(new Pair(4, 6));
		list.add(new Pair(6, 8));
		list.add(new Pair(10, 12));
		list.add(new Pair(12, 15));

		System.out.println("given interval is: ");
		for (int index = 0; index < list.size(); index++) {
			System.out.print("[" + list.get(index).first + "," + list.get(index).second + "] ");
		}
		ArrayList<Pair> result = mergeIntervals(list);

		System.out.println("\n\nmerged interval is: ");
		for (int index = 0; index < result.size(); index++) {
			System.out.print("[" + result.get(index).first + "," + result.get(index).second + "] ");
		}
	}

}


/* output:
given interval is: 
[1,5] [3,7] [4,6] [6,8] [10,12] [12,15] 

merged interval is: 
[1,8] [10,15] 


Problem Statement:
------------------
You are given an array (list) of interval pairs as input where each interval has a start and end timestamp.
The input array is sorted by starting timestamps. You are required to merge overlapping intervals and 
return a new output array.
*/