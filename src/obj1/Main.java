package obj1;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		
		// 子供たちに名前をお小遣いを授ける
		user1.input("たーくん", 15000);
		user2.input("まこたん", 0);
		user3.input("こうくん", 2500000);
		
		// 子供のお金の使い方に対して子供にランキングを発表する
		user1.ranking();
		user2.ranking();
		user3.ranking();
		
		// 子供に対して自分の状態を教えるようにお願いする
		user1.output();
		user2.output();
		user3.output();
	}

}
