package BasicPractice;

public class makePrimeLadder {

	public static void main(String[] args) {

		int n = 10;
		display(makeLadder(n));
	}

	public static int[] makeLadder(int n) {

		int[] ladder = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			if (checkPrime(i)) {
				ladder[i] = 1;
			}
		}

		int first = 0, second = 0, lastfirst = 0, lastsecond = 0;

		for (int i = 0; i <= n; i++) {
			if (ladder[i] == 1) {
				if (first == 0) {
					first = i;
				} else if (first > 0 && second == 0) {
					second = i;
				}
			}

			if (first > 0 && second > 0) {
				break;
			}
		}

		for (int i = n; i >= 0; i--) {
			if (ladder[i] == 1) {
				if (lastfirst == 0) {
					lastfirst = i;
				} else if (lastfirst > 0 && lastsecond == 0) {
					lastsecond = i;
				}
			}

			if (lastfirst > 0 && lastsecond > 0) {
				break;
			}
		}

		ladder[first] = lastfirst;
		ladder[second] = lastsecond;
		ladder[lastfirst] = first;
		ladder[lastsecond] = second;

		return ladder;
	}

	public static boolean checkPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void display(int[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
}
