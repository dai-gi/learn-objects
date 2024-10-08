package obj1;

public class User {
	String userName;
	int amount;
	String ranking;
/*
 クラスと同名のメソッドが内部で実行されて、
 オブジェクトが生成されることをコンストラクタという。
*/
//	public User() {
//	}
	
	/**
	 * コンストラクタはメソッドなので、引数を持たせることができる。
	 * @param inputName　  Inputする名前情報
	 * @param inputAmount　Inputする売上情報
	 */
	public User(String inputName, int inputAmount) {
		this.userName = inputName;
		this.amount = inputAmount;
	}
	
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
	 * User情報を出力するメソッド
	 */
	void output() {
		System.out.println("名前:" + this.userName);
		System.out.println("金額:" + this.amount);
		System.out.println("顧客ランク:" + this.ranking);
	}
}
