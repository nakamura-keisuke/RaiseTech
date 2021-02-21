package practice8;

public class Sample8_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//メソッドの呼び出し（Machineクラスから）

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

				machine1.showData();
				machine2.showData();
				
				

	}

}
