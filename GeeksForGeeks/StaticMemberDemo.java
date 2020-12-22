package GeeksForGeeks;

public class StaticMemberDemo {

	public static void main(String[] args) {
		System.out.println(Player.getPlayerCount());
		Player obj = new Player("Nirmal Silwal");
		System.out.println(Player.getPlayerCount());
	}

}

class Player {
	String name;
	int id;
	private static int playerCount = 0;

	Player(String name) {
		this.name = name;
		id = ++playerCount;
	}

	public static int getPlayerCount() {
		return playerCount;
	}
}


/* output: 
0
1
*/