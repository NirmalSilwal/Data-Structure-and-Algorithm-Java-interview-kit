package livecontest.Round728Div2;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B {

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t = sc.nextInt();
		for (int tt = 0; tt < t; tt++) {
			int n = sc.nextInt();
			long[] arr = new long[n + 1];

			// read array
			for (int i = 1; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			solveTask2(arr, n);
		}

		out.close();
	}

	private static void solveTask2(long[] arr, int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {

			for (long j = arr[i] - i; j <= n; j += arr[i]) {

				if (j >= 0) {

					if (arr[i] * arr[(int) j] == i + j && i < j)
						count++;
				}
			}
		}
		System.out.println(count);
	}

	// this will get TLE
	/*
	 * private static void solveTask(int[] arr) { int count = 0;
	 * 
	 * for (int i = 0; i < arr.length; i++) {
	 * 
	 * for (int j = i + 1; j < arr.length; j++) {
	 * 
	 * int ci = i + 1, cj = j + 1;
	 * 
	 * if ((arr[i] * arr[j]) == (ci + cj)) count++; } }
	 * System.out.println(count); }
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
