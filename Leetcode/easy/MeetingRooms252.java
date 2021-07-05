package easy;

import java.util.Arrays;

/*
Given an array of meeting time intervals where intervals[i] = [starti, endi], 
determine if a person could attend all meetings.

Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false

Example 2:
Input: intervals = [[7,10],[2,4]]
Output: true
*/

public class MeetingRooms252 {

	// O(N^2) Time | O(1) Space
	public static boolean canAttendMeetings1(int[][] intervals) {

		for (int id = 0; id < intervals.length; id++) {

			for (int curr = 0; curr < intervals.length; curr++) {

				if (id != curr) {

					int start1 = intervals[id][0], end1 = intervals[id][1];
					int start2 = intervals[curr][0], end2 = intervals[curr][1];

					boolean checkOverlap = isOverlapping(start1, end1, start2, end2);

					if (checkOverlap == true) {
						return false;
					}
				}
			}
		}
		return true;
	}

	private static boolean isOverlapping(int start1, int end1, int start2, int end2) {
		if (start1 == start2)
			return true;

		if (start1 > start2 && start1 < end2)
			return true;

		if (end1 > start2 && end1 < end2)
			return true;

		if (start2 > start1 && start2 < end1)
			return true;

		if (end2 > start1 && end2 < end1)
			return true;
		return false;
	}

	// O(NlogN) Time | O(1) Space
	public static boolean canAttendMeetings(int[][] intervals) {

		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		for (int id = 0; id < intervals.length - 1; id++) {
			if (intervals[id][1] > intervals[id + 1][0]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		/* test cases */
		// [[8,11],[17,20],[17,20]]
		// [[13,15],[1,13]]
		// { 7, 10 }, { 2, 4 }

		int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 } }; // false
		System.out.println(canAttendMeetings1(intervals));
		System.out.println(canAttendMeetings(intervals));
	}
}
