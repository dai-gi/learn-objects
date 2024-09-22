package obj1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		User user1 = new User("たーくん", 15000);
		User user2 = new User("まこたん", 0);
		User user3 = new User("超富裕層Aさん", 2500000);
		
		List<User> userList = new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
				
		for (User tarUser : userList) {
			tarUser.rankJudge();
			tarUser.output();
		}
	}
}
