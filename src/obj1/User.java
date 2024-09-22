package obj1;

public class User {
	String userName;
	int amount;
	String ranking;
	
	/**
	 * Userの入力用のメソッド
	 * @param inputName    Inputする名前情報
	 * @param inputAmount  Inputする売上情報
	 */
	void input(String inputName, int inputAmount) {
		userName = inputName;
		amount = inputAmount;
	}
	
	/**
	 * Userの売上額から、顧客ランクの設定を行う
	 */
	void rankJudge() {
		if (amount >= 80) {
			ranking = "お得意様";
		} else if (amount >= 60) {
			ranking = "常連様";
		} else if (amount >= 40) {
			ranking = "新規顧客";
		} else {
			ranking = "冷やかし客";
		}
	}
	
	/**
	 * 自分の状態を伝えるメソッド
	 */
	void output() {
		System.out.println("名前:" + this.userName);
		System.out.println("金額:" + this.amount);
		System.out.println("成績:" + this.grades);
	}
}
