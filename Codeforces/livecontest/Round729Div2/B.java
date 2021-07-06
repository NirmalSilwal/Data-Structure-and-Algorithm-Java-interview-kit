package livecontest.Round729Div2;

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
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			boolean ans = solveTask(n, a, b);
			String result = ans == true ? "Yes" : "No";
			out.println(result);
		}
		out.close();
	}

	private static boolean solveTask(long n, long a, long b) {
		if (a == 1) {
			if ((n - 1) % b == 0)
				return true;
			else
				return false;
		} else {
			long curr = 1;
			while (curr <= n) {
				if ((n - curr) % b == 0) {
					return true;
				}
				curr *= a;
			}
		}
		return false;
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
