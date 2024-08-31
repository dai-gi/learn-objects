package myobj;

public class Vehicle {
	/**
	 * carModel   車種
	 * ownerName  所有者
	 * amountFuel 燃料量
	 */
	String carModel;
	String ownerName;
	int amountFuel;
	
	/**
	 * 所有者を登録するメソッド
	 * @param ownerName  登録する所有者名
	 * @param carModel   車種
	 */
	void ownerShip(String ownerName, String carModel) {
		this.ownerName = ownerName;
		this.carModel = carModel;
	}
	
	/**
	 * 車両を始動するメソッド
	 */
	void starting() {
		System.out.println("エンジン始動");
		System.out.println("前進");
		this.amountFuel -= 50;
	}
	
	/**
	 * 車両を停止するメソッド
	 */
	void stop() {
		System.out.println("停止");
		System.out.println("エンジン停止");
	}
	
	/**
	 * 給油するメソッド
	 * @param amountToRefuel  給油量を指定（少し：10L, 半分：50L, 満タン：消費量全て）
	 */
	void refuel(String amountToRefuel) {
		if (amountToRefuel == "少し") {
			this.amountFuel += 10;
		} else if (amountToRefuel == "半分") {
			this.amountFuel += 50;
		} else if (amountToRefuel == "満タン") {
			this.amountFuel = this.amountFuel + (this.amountFuel - 100);
		}
	}
}
