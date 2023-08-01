package ch04;

/**
 * 問題２:int[] array = new int[] {5, 6}; 各要素の値を記載してください。
 */
public class T0402 {
	public static void main(String[] args) {
		int[] array = new int[] { 5, 6 };
		for (int x : array) {
			System.out.println(x);
		}
	}

}
