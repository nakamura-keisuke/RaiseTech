package practice10;

public class Sample10_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Machine machine1=new Machine();

		machine1.getValue( "M001" );
		System.out.println( "型番は" + machine1.getSerialNumber() + "です。" );
		System.out.println( "--------------------------------------" );

		machine1.getValue( "M002",110 );
		System.out.println( "型番は" + machine1.getSerialNumber() + "です。" );
		System.out.println( "高さは" + machine1.getheight() + "です。" );
		System.out.println( "--------------------------------------" );

		machine1.getValue( "M003", 120, 120, 100, "レモン味", 100 );
		machine1.showData();
	}

	}
