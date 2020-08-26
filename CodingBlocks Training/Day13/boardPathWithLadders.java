package Lecture13;

public class boardPathWithLadders {

	public static void main(String[] args) {

		int boardLen = 10;

		boolean[] primes = new boolean[boardLen+1];

		for (int position = 0; position < primes.length; position++) {
			if (checkPrime(position)) {
				primes[position] = true;
			}
		}
		
		int[] ladders = makeLadder(boardLen, primes);
		System.out.println("ladder is : ");
		display(ladders);
		
		int current = 0;
		String result = "";
		
		System.out.println("\nall possible board paths: ");
		boardPath(ladders, current, boardLen, result);

	}

	public static boolean checkPrime(int index) {
		if (index < 2) {
			return false;
		}
		for (int pos = 2; pos <= index / 2; pos++) {
			if (index % pos == 0) {
				return false;
			}
		}

		return true;
	}

	public static int[] makeLadder(int n, boolean[] primes) {
		int[] ladder = new int[n + 1];

		int front = 0, back = ladder.length - 1;
		// two pointer approach

		while (front < back) {

			while (primes[front] != true) {
				front++;
			}

			while (primes[back] != true) {
				back--;
			}

			ladder[front] = back;
			ladder[back] = front;
			front++;
			back--;
		}

		return ladder;
	}

	public static void boardPath(int[] ladder, int curr, int end, String result) {

		if (curr == end) {
			System.out.println(result);
			return;
		}
		if (curr > end) {
			return;
		}

		if (ladder[curr] != 0 && curr < ladder[curr]) {
			boardPath(ladder, ladder[curr], end, result + ladder[curr]);
		} else {
			for (int dice = 1; dice <= 6; dice++) {
				boardPath(ladder, curr + dice, end, result + dice);
			}
		}
	}

	public static void display(int[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

}
