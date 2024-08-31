package obj1;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		new User();
		
		user1.input("たーくん", 5200);
		user2.input("まこたん", 0);
		user3.input("超富裕層Aさん", 2500000);
		
		user1.ranking();
		user2.ranking();
		user3.ranking();
		
		user1.output();
		user2.output();
		user3.output();
	}

}
