package obj1;
import java.util.Random;

public class User {
    // フィールド	
	// userName    名前
	// amount      金額
	// grades      成績
	String userName;
	int amount;
	String grades;
	
	/**
	 * 母から名前とお小遣いを授かるメソッド
	 * @param inputName    名前
	 * @param inputAmount  お小遣い
	 */
	void input(String inputName, int inputAmount) {
		this.userName = inputName;
		this.amount = inputAmount;
	}
	
	/**
	 * 学校からの成績表を受け取るメソッド
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
