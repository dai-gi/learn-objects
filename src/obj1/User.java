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
	 * 子供たちに名前をお小遣いを授ける
	 * @param inputName    子供の名前
	 * @param inputAmount  お小遣い
	 */
	void input(String inputName, int inputAmount) {
		this.userName = inputName;
		this.amount = inputAmount;
	}
	
	/**
	 * 子供のお金の使い方に対して子供にランキングを発表する
	 */
	void ranking() {
		if (amount >= 1000000) {
			ranking = "お金の使い方が上手";
		} else if (amount >= 10000) {
			ranking = "お金の使い方が普通";
		} else if (amount == 0) {
			ranking = "お金の使い方が荒い";
		} 
	}
	
	/**
	 * 子供に対して自分の状態を教えるようにお願いする
	 */
	void output() {
		System.out.println("名前:" + userName);
		System.out.println("金額:" + amount);
		System.out.println("ランキング:" + ranking);
	}
}
