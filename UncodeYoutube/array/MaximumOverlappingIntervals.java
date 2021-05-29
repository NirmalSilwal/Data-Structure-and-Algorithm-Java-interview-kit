package array;

public class MaximumOverlappingIntervals {

	public static int countOverlappingIntervals(int[][] range) {
		int count = 0;

		for (int i = 0; i < range.length; i++) {
			int start = range[i][0], end = range[i][1];
			
			for (int ptr = 0; ptr < range.length; ptr++) {
			
				if (ptr != i) {
					int currstart = range[ptr][0], currend = range[ptr][1];

					if ((currstart >= start && currstart <= end) 
							|| (currend >= start && currend <= end)
							|| (start >= currstart && start <= currend) 
							|| (end >= currstart && end <= currend)) {
						count++;
						break;
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		 int[][] intervals = { { 1, 3 }, { 4, 10 }, { 5, 8 }, { 6, 9 } };
//		int[][] intervals = { { 1, 3 }, { 4, 10 }, { 5, 8 } };

		System.out.println(countOverlappingIntervals(intervals));
	}
}
