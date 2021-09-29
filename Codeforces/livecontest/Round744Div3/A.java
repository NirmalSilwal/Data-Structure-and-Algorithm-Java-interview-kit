package livecontest.Round744Div3;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t = sc.nextInt();
		for (int tt = 0; tt < t; tt++) {
			String s = sc.next();
			System.out.println(solveTask(s, out));
		}

		out.close();
	}

	private static String solveTask(String s, PrintWriter out) {

		int[] arr = new int[3];

		for (char ch : s.toCharArray()) {
			if (ch == 'A')
				arr[0] += 1;
			else if (ch == 'B')
				arr[1] += 1;
			else
				arr[2] += 1;
		}

		// if B's count is zero return No
		if (arr[1] == 0)
			return "NO";

		// A's counts is zero
		if (arr[0] == 0) {
			return arr[1] == arr[2] ? "YES" : "NO";
		}

		// C's counts is zero
		if (arr[2] == 0) {
			return arr[0] == arr[1] ? "YES" : "NO";
		}

		if (arr[0] < arr[2]) {
			// A's count is less than C's count
			while ((arr[0] > 0 && arr[1] > 0) && (arr[0] != 0 || arr[1] != 0)) {
				arr[0]--;
				arr[1]--;
			}
			if (arr[0] == 0)
				return arr[1] == arr[2] ? "YES" : "NO";
			else if (arr[1] == 0)
				return "NO";

		} else {
			// C's count is less than A's count
			while ((arr[2] > 0 && arr[1] > 0) && (arr[2] != 0 || arr[1] != 0)) {
				arr[2]--;
				arr[1]--;
			}
			if (arr[2] == 0)
				return arr[1] == arr[0] ? "YES" : "NO";
			else if (arr[1] == 0)
				return "NO";
		}

		return arr[0] == 0 && arr[1] == 0 && arr[2] == 0 ? "YES" : "NO";
	}

	/*
	 * private static long gcd(long a, long b) { if (b == 0) return a; return
	 * gcd(b, a % b); }
	 */
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int[] readArray(int n) {
			int[] temparr = new int[n];
			for (int i = 0; i < n; i++) {
				temparr[i] = nextInt();
			}
			return temparr;
		}
	}
}
