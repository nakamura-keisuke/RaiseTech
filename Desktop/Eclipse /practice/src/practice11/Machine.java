package practice11;

public class Machine {

	String serialNumber;
	int height;
	int width;
	int weight;
	String product;
	int capacity;

	void show() {
		System.out.println("型番は"+serialNumber+"です");
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
		void setserialNumber(String sn) {
			serialNumber=sn;
		}

		void setheight(int h) {
			height=h;
		}

		void setwidth(int wi) {
			width=wi;
		}

		void setweight(int we) {
			weight=we;
		}

		void setproduct(String p) {
			product=p;
		}

		void setcapacity(int c) {
			capacity=c;
		}

		void setValue(String sn,int h,int wi,int we,String p,int c) {
			serialNumber=sn;
			height=h;
			width=wi;
			weight=we;
			product=p;
			capacity=c;
		}

		Machine(){
			serialNumber="M000";
			height=100;
			width=100;
			weight=100;
			product="キャンディ";
			capacity=100;
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
