package livecontest.Round728Div2;

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
			int x = sc.nextInt();
			solveTask(x);
			System.out.println();
		}

		out.close();
	}

	// 1 to n cats

	private static void solveTask(int n) {
		int[] arr = new int[n];
		for (int i = 1; i <= n; i++) {
			arr[i - 1] = i;
		}

		for (int i = 0; i < arr.length; i += 2) {
			if (i == (n - 1)) {
				swap(arr, i, i - 1);
			} else {
				swap(arr, i, i + 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

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
