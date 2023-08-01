package ch04;

public class T0408 {
//問題７:⾏列（２次元配列）の積を計算してください。//
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [][] array2d = new int [][] {
			{1,2,3,4},
			{5,6,7,8}
		};
		int sum = 1;
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				sum = sum * array2d[i][j];
			}
		}
		System.out.println( "sum=" + sum );
			}
		
		
	}
