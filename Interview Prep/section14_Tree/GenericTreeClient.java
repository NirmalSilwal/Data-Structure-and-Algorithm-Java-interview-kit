package section14_Tree;

public class GenericTreeClient {

	public static void main(String[] args) {

		GenericTree tree = new GenericTree();
		tree.display();

		/*
		 * test input, paste this in console 
		 * 60 3 41 2 17 0 16 0 15 1 21 0 24 2 33 0 84 0
		 */
	}
}

/* output:

enter data for root node: 
60 3 41 2 17 0 16 0 15 1 21 0 24 2 33 0 84 0
Enter no. of children for: 60
Enter data for 0th child of 60
Enter no. of children for: 41
Enter data for 0th child of 41
Enter no. of children for: 17
Enter data for 1th child of 41
Enter no. of children for: 16
Enter data for 1th child of 60
Enter no. of children for: 15
Enter data for 0th child of 15
Enter no. of children for: 21
Enter data for 2th child of 60
Enter no. of children for: 24
Enter data for 0th child of 24
Enter no. of children for: 33
Enter data for 1th child of 24
Enter no. of children for: 84
60 => 41, 15, 24, END
41 => 17, 16, END
17 => END
16 => END
15 => 21, END
21 => END
24 => 33, 84, END
33 => END
84 => END
*/