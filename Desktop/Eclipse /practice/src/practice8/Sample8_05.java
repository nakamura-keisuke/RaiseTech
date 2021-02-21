package practice8;

public class Sample8_05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Machine machine1=new Machine();
		machine1.setValue("M001",150,120,98,"キャンディ（レモン味）", 100);


		//machine2の作成　インスタンス化・フィールドの設定
		Machine machine2=new Machine();
		machine2.setValue("M002",140,110,95,"キャンディ(リンゴ味)",120);


		machine1.showData();
		machine2.showData();

	}

}
