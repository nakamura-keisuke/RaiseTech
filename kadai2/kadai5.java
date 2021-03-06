package second;

import java.util.ArrayList;
import java.util.HashMap;

public class kadai5 {

	public static void main(String[] args) {
	//ListとMapの作成

    ArrayList <String> color = new ArrayList<String>();
    color.add("red");
    color.add("blue");
    color.add("yellow");
    System.out.println(color.get(0));

    HashMap<Integer, String> season = new HashMap();
    season.put(1,"spring");
    season.put(2,"summer");
    season.put(3,"fall");
    season.put(4,"winter");
    System.out.println(season.get(0));
    }

}
