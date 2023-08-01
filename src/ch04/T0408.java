package ch04;

/**
 * 問題７:⾏列（２次元配列）の積を計算してください。
 */
public class T0408 {
	public static void main(String[] args) {
		int[][] array2d = new int[][] {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 }
		};
		int sum = 1;
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				sum = sum * array2d[i][j];
			}
		}
		System.out.println("sum=" + sum);
	}

}
