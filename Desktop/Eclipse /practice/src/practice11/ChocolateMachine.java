package practice11;

public class ChocolateMachine extends Machine{

		int temperature;

		ChocolateMachine(String sn,int h,int wi,int we,String p,int c){
			super();
			System.out.println("チョコレート製造機を作成しました");
		}



		void heat(int t) {

			temperature=t;
			if(t>45) {
				System.out.println(temperature+"度に温めました");
			}else {
				System.out.println("温めませんでした");
			}

		}

	}
