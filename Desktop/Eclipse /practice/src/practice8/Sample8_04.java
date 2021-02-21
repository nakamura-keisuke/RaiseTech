package practice8;

public class Sample8_04 {

	public static void main(String[]arge) {

	//メソッドの呼び出し（Machineクラスから）

	//machine1の作成　インスタンス化・フィールドの設定
			Machine machine1=new Machine();

			machine1.setserialNumber("M001");
			machine1.setheight(150);
			machine1.setwidth(120);
			machine1.setweight(98);
			machine1.setproduct("キャンディ(レモン味)");
			machine1.setcapacity(100);

			//machine2の作成　インスタンス化・フィールドの設定
			Machine machine2=new Machine();

			machine2.setserialNumber("M002");
			machine2.setheight(140);
			machine2.setwidth(110);
			machine2.setweight(95);
			machine2.setproduct("キャンディ(りんご味)");
			machine2.setcapacity(120);

			machine1.showData();
			machine2.showData();
}
}
