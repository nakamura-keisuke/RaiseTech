package Nyuumon5;

public class N12 {

	//int型配列を受け取り、全ての要素を表示するメソッド

	public static void printArray(int[] array) {
		for(int element:array) {
			System.out.println(element);
		}
	}

	public static void main(String[]arge) {
		int[]array= {1,2,3};
		printArray(array);
	}

}
