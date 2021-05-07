package easy;

public class NthFibonacci {

	public static int getNthFib(int n) {
		int first = 0, second = 1;
		if (n == 0 || n == 1)
			return first;
		if (n == 2)
			return second;

		int count = 3;
		while (count <= n) {
			int next = first + second;
			first = second;
			second = next;
			count++;
		}
		return second;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(getNthFib(i) + " ");
		}
	}
}
