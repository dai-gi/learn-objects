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
	 * 子供たちの名前とお小遣いの金額をセットする関数
	 * @param inputName    子供の名前
	 * @param inputAmount  お小遣い
	 */
	void input(String inputName, int inputAmount) {
		this.userName = inputName;
		this.amount = inputAmount;
	}
		
	/**
	 * 子供達のお金の使い方についてタグづけをする関数
	 */
	void ranking() {
		if (amount >= 1000000) {
			ranking = "お得意様";
		} else if (amount >= 1000000) {
			ranking = "常連様";
		} else if (amount >= 1000000) {
			ranking = "新規顧客";
		} else {
			ranking = "冷やかし客";
		}
	}
	
	/**
	 * 母に自分の状態を伝える関数
	 */
	void output() {
		System.out.println("名前:" + userName);
		System.out.println("金額:" + amount);
		System.out.println("ランキング:" + ranking);
	}
}