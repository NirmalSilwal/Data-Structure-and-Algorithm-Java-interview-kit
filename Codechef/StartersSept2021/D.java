package StartersSept2021;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D {

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t = sc.nextInt();

		for (int tt = 0; tt < t; tt++) {
			int N = sc.nextInt();
			int[][] grid = new int[N][N];

			if (N % 2 == 0) {
				evenFill(grid);
			} else {
				oddFill(grid);
			}
			display2D(grid);
		}

		out.close();
	}

	// use String to avoid TLE
	
	private static void oddFill(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			Arrays.fill(grid[i], 1);
			grid[i][i] = -1;
		}
	}

	private static void evenFill(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			Arrays.fill(grid[i], -1);
		}
	}

	private static void display2D(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
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
