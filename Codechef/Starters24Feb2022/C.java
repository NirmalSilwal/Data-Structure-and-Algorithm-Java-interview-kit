package Codechef.Starters24Feb2022;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C {

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t = sc.nextInt();

		for (int tt = 0; tt < t; tt++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();

			solveTask(A, B, C, P, Q, R, sc, out);
		}
		out.close();
	}

	private static void solveTask(int a, int b, int c, int p, int q, int r, FastReader sc, PrintWriter out) {
		int votestowin = (p + q + r) / 2; // more than this votes required to win election

		if ((a + b + c) > votestowin) {
			System.out.println("YES"); // win without hacking
			return;
		}

		// if hacking required
		if ((p + b + c) > votestowin) {
			System.out.println("YES");
		} else if ((a + q + c) > votestowin) {
			System.out.println("YES");
		} else if ((a + b + r) > votestowin) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
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
