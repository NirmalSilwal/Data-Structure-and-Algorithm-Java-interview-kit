package Codechef.Starters24Feb2022;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B {

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t = sc.nextInt(); // test cases

		for (int tt = 0; tt < t; tt++) {
			int total = sc.nextInt(); // total people
			int infected = sc.nextInt(); // total infected people
			solveTask(total, infected, sc, out);
		}

		out.close();
	}

	private static void solveTask(int total, int infected, FastReader sc, PrintWriter out) {
		// if fully healthy
		if (infected == 0) {
			System.out.println(total);
			return;
		}
		// if fully infected
		if (total == infected) {
			System.out.println((2 * infected) - 1);
			return;
		}
		int healthy = total - infected;
		System.out.println(healthy + (2 * infected));
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
