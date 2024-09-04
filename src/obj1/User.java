package obj1;

public class User {
	/**
	 * userName  名前
	 * amount    金額
	 * ranking   ランキング
	 */
	String userName;
	int amount;
	String ranking;
	
	/**
	 * 子供達の属性を定義する
	 * @param inputName    子供の名前
	 * @param inputAmount  お小遣い
	 */
	void input(String inputName, int inputAmount) {
		this.userName = inputName;
		this.amount = inputAmount;
	}
	
	/**
	 * 子供達のお金の使い方についてタグづけをする
	 */
	void ranking() {
		if (amount >= 1000000) {
			ranking = "お金の使い方が上手な子";
		} else if (amount >= 100000) {
			ranking = "お金の使い方が普通の子";
		} else if (amount >= 1) {
			ranking = "お金の使い方が苦手な子";
		} else {
			ranking = "お金の使い方が荒い子";
		}
	}
	
	/**
	 * 自分の子供について振り返る
	 */
	void output() {
		System.out.println("名前:" + userName);
		System.out.println("金額:" + amount);
		System.out.println("ランキング:" + ranking);
	}
}
