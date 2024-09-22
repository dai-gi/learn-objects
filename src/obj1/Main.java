package obj1;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		
		// 子供たちに名前とお小遣いを授ける
		user1.input("たーくん", 15000);
		user2.input("まこたん", 0);
		user3.input("こうくん", 250000);
		
        // 子供から成績表を受け取るだけ
		String receiveGradeBook1 = user1.gradebook();
		String receiveGradeBook2 = user2.gradebook();
		String receiveGradeBook3 = user3.gradebook();
		
		// 子供に対して自分の状態を教えるようにお願いする
		user1.output();
		user2.output();
		user3.output();
	}

}
