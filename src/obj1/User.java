package obj1;

public class User {
	String userName;
	int amount;
	String ranking;
	
	int input(String inputName, int inputAmount) {
		userName = inputName;
		this.amount = inputAmount;
		return 15;
	}
	
	void ranking() {
		if (amount >= 1000000) {
			ranking = "お得意様";
		} else if (amount >= 1000000) {
			ranking = "新規顧客";
		} else if (amount >= 1000000) {
			ranking = "新規顧客";
		} else {
			ranking = "冷やかし客";
		}
	}
	
	void output() {
		System.out.println("名前:" + userName);
		System.out.println("金額:" + amount);
		System.out.println("ランキング:" + ranking);
	}
}
