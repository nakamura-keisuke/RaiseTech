package practice8;

public class Sample8_01 {

	public static void main(String[]arge) {

		//machineクラスのインスタンスの作成

		//machine1の作成　インスタンス化・フィールドの設定
		Machine machine1;
		machine1=new Machine();

		machine1.serialNumber="M001";
		machine1.height=150;
		machine1.width=120;
		machine1.weight=98;
		machine1.product="キャンディ(レモン味)";
		machine1.capacity=100;

		//machine2の作成　インスタンス化・フィールドの設定
		Machine machine2=new Machine();

		machine2.serialNumber="M002";
		machine2.height=140;
		machine2.width=110;
		machine2.weight=95;
		machine2.product="キャンディ(りんご味)";
		machine2.capacity=120;

		//machine1のフィールド表示
		System.out.println("machine1の型番は"+machine1.serialNumber+"です");
		System.out.println("machine1の高さは"+machine1.height+"です");
		System.out.println("machine1の幅は"+machine1.width+"です");
		System.out.println("machine1の重さは"+machine1.weight+"です");
		System.out.println("machine1の生産物は"+machine1.product+"です");
		System.out.println("machine1の生産能力は"+machine1.capacity+"です");

		System.out.println("-------------------------------------------");

		System.out.println("machine2の型番は"+machine2.serialNumber+"です");
		System.out.println("machine2の高さは"+machine2.height+"です");
		System.out.println("machine2の幅は"+machine2.width+"です");
		System.out.println("machine2の重さは"+machine2.weight+"です");
		System.out.println("machine2の生産物は"+machine2.product+"です");
		System.out.println("machine2の生産能力は"+machine2.capacity+"です");



	}

}
