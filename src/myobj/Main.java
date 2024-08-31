package myobj;

public class Main {
	public static void main(String[] args) {
		// インスタンス化
		Vehicle car = new Vehicle();
		Vehicle bike = new Vehicle();
		Vehicle track = new Vehicle();

		// 所有
		car.ownerShip("たーくん", "普通自動車");
		bike.ownerShip("たーくん", "普通二輪車");
		track.ownerShip("たーくん", "中型トラック");
		
		// 始動
		car.starting();
		bike.starting();
		track.starting();
		
		// 停止する
		car.stop();
		bike.stop();
		track.stop();
		
		// 給油する
		car.refuel("少し");
		bike.refuel("半分");
		track.refuel("満タン");
	}
}
