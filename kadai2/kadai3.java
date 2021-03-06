package second;

import java.time.LocalDateTime;

public class kadai3 {

	public static void main(String[]args) {
		//３年後の今日の曜日

	    LocalDateTime day1 = LocalDateTime.now();
	    LocalDateTime day2 = day1.plusYears(3);
	    System.out.println(day2.getDayOfWeek());
	}

}
