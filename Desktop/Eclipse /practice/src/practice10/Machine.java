package practice10;

public class Machine {

	//カプセル化①　外のクラスからmachineフィールドを参照不可能にする
	private String SerialNumber;
	private int height;
	private int width;
	private int weight;
	private String product;
	private int capacity;

	static int counter;

	void show() {
		System.out.println("型番は"+SerialNumber+"です");
		System.out.println("高さは"+height+"です");
		System.out.println("幅は"+width+"です");
		System.out.println("重さは"+weight+"です");
		System.out.println("生産物は"+product+"です");
		System.out.println("生産能力は"+capacity+"です");

	}
		void showData() {
			System.out.println("機械の情報を表示します");
			show();
		}
		String getSerialNumber(){
			return SerialNumber;
		}

		int getheight() {
			return height;
		}

		int getwidth() {
			return width;
		}

		int getweight() {
			return weight;
		}

		String getproduct() {
			return product;
		}

		int getcapacity() {
			return capacity;
		}

		void getValue(String sn) {
			SerialNumber=sn;
		}

		void getValue(String sn,int h) {
			SerialNumber=sn;
			height=h;
		}


		void getValue(String sn,int h,int wi,int we,String p,int c) {
			SerialNumber=sn;
			height=h;
			width=wi;
			weight=we;
			product=p;
			capacity=c;
		}

		Machine(){
			SerialNumber="M000";
			height=100;
			width=100;
			weight=100;
			product="キャンディ";
			capacity=100;



		}

		static void showcounter() {
			System.out.println("カウンターは"+counter+"です");

		}

		//あめを練る
		String mix(String s1,String s2) {
			if(s1.equals("砂糖")&&s2.equals("水")){
				return"ペースト状のアメができました";
			}else {
				return"あめの作成に失敗しました";
			}
		}
}
