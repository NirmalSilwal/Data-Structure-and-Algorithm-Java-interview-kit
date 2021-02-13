package section11_Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		firstNonRepeatingCharInStream();
	}

	static void firstNonRepeatingCharInStream() {

		Scanner sc = new Scanner(System.in);
		Queue<Character> queue = new LinkedList<Character>();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		System.out.println("Enter characters... Press . to stop taking chars\n");

		char cc = sc.next().charAt(0);

		while (cc != '.') {
			// reading streams of character

			queue.add(cc);

			if (map.get(cc) == null)
				map.put(cc, 1);
			else
				map.put(cc, map.get(cc) + 1);

			while (!queue.isEmpty()) {
				char frontChar = queue.peek();

				if (map.get(frontChar) == 1) {
					System.out.println("output: " + frontChar + " ");
					break;
				} else {
					queue.poll();
				}
			}

			if (queue.isEmpty()) {
				System.out.println("output: " + -1 + " ");
			}

			cc = sc.next().charAt(0);
		}

		sc.close();
	}

}


/* output:

Enter characters... Press . to stop taking chars

c
output: c 
b
output: c 
a
output: c 
b
output: c 
c
output: a 
a
output: -1 
d
output: d 
b
output: d 
d
output: -1 
.
*/