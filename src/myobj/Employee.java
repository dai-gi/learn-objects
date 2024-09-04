package myobj;

public class Employee {
	/**
	 * occupation   職種
	 * salary       給与
	 * grades       成績
	 */
	String occupation;
	String grades;
	int salary;
	
	/**
	 * 会社と契約する
	 * @param occupation  職種
	 * @param salary      給与
	 */
	void contract(String occupation, int salary) {
		this.occupation = occupation;
		this.salary = salary;
	}
	
	/**
	 * 会社からの人事評価を受け取る
	 * @param grades  成績
	 */
	void evaluation(String grades) {
		this.grades = grades;
		
		// 評価に準じた昇給額も記載されている
		if (this.grades == "A") {
			this.salary += 200000;
			System.out.println("やったー！");
		} else if (this.grades == "B") {
			this.salary += 50000;
			System.out.println("次は頑張ろう。");
		} else if (this.grades == "C") {
			System.out.println("努力しよう");
		}
	}
}
