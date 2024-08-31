package myobj;

public class Vehicle {
	String carModel; // 車種
	String ownerName; // 所有者名
	int amountFuel; // 燃料量
	
	// 振る舞い
	// ・所有する
	void ownerShip(String carModel, String ownerName) {
		this.carModel = carModel;
	}
	// ・前進する
	// ・停止する
	// ・給油する
}
