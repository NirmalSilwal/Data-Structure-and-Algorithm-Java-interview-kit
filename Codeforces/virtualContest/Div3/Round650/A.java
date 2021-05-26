package virtualContest.Div3.Round650;

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
		String[] keys = new String[t];
		for (int i = 0; i < keys.length; i++) {
			keys[i] = sc.next();
		}

		for (String key : keys) {
			if (key.length() == 2) {
				out.println(key);
			} else {
				String ans = findSecret(key);
				out.println(ans);
			}
		}

		out.close();
	}

	private static String findSecret(String key) {
		String ans = "" + key.charAt(0) + key.charAt(1);
		for (int k = 3; k < key.length(); k += 2) {
			ans = ans + key.charAt(k);
		}
		return ans;
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
	}
}
