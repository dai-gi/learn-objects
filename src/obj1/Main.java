package obj1;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		
		// 子供たちの属性を定義する
		user1.input("たーくん", 5200);
		user2.input("まこたん", 0);
		user3.input("こうくん", 2500000);
		
		// 子供のお金の使い方についてタグづけをする
		user1.ranking();
		user2.ranking();
		user3.ranking();
		
		// 自分の子供について振り返る
		user1.output();
		user2.output();
		user3.output();
	}

}
