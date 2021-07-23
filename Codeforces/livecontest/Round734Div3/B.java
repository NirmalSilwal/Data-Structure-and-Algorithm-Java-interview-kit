package livecontest.Round734Div3;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);

		int t = sc.nextInt();
		for (int tt = 0; tt < t; tt++) {
			String s = sc.next();
			solveTask(s, out);
		}
		out.close();
	}

	private static void solveTask(String s, PrintWriter out) {
		int colors = 0;
		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : s.toCharArray()) {
			if (!map.containsKey(ch))
				map.put(ch, 1);
			else {
				map.put(ch, map.get(ch) + 1);
			}
		}

		int count1s = 0;

		for (Map.Entry<Character, Integer> entries : map.entrySet()) {
			int value = entries.getValue();

			if (value == 1) {
				count1s++;
			} else if (value >= 2) {
				colors++;
			}
		}

		colors = colors + (count1s / 2);

		out.println(colors);
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
