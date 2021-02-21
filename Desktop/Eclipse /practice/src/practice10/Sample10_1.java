package practice10;


public class Sample10_1 {

	//カプセル化①　外のクラスからmachineフィールドを参照不可能にする
	//machineクラス外から呼び起こして、不可視になるか確認

	public static void main(String[]args) {

		Machine machine1=new Machine();

		machine1.getSerialNunmer("M001");

		System.out.println("シリアルナンバーは"+machine1.getSerialNumber()+"です");
	}

}
