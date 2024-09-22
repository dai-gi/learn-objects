package obj1;
import java.util.Random;

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
	String gradebook() {
        // 科目に対する評価が10段階で渡される	
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		
        // 総合評価が A, B, C で渡される	
		if (num >= 8) {
			this.grades = "A";
		} else if (num >= 5) {
			this.grades = "B";
		} else {
			this.grades = "C";
		}
		
		return this.grades;
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
