package livecontest.EducationalRound114;

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
			int n = sc.nextInt();

			for (int i = n; i > 0; i--) {
				solveTask(n, i, out);
				solveTask(n, n - i, out);
				System.out.println();
			}
		}
		out.close();
	}

	private static void solveTask(int n, int pairs, PrintWriter out) {
		// opening bracket
		for (int i = 0; i < pairs; i++) {
			System.out.print("(" + "");
		}

		for (int i = 0; i < pairs; i++) {
			System.out.print(")" + "");
		}
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
