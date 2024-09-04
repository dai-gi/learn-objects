package myobj;

public class Main {
	public static void main(String[] args) {
		
		// 求職者３名と面接を行う。
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		
		// ３名を採用し、契約を交わす。
		employee1.contract("人事", 400000);
		employee2.contract("エンジニア", 500000);
		employee3.contract("営業", 600000);
		
		// 人事評価を各々に通知する
		employee1.evaluation("A");
		employee2.evaluation("B");
		employee3.evaluation("C");
		
	}
}
