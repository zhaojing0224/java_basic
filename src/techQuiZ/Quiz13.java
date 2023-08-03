package techQuiZ;

/**
 * 練習問題 2- 2:以下の条件に基づき、Javaプログラムを作成してください。
2次元のint型配列を作成し、任意の値で初期化してください。
配列の行と列の合計値を計算し、それらの合計値を格納する1次元配列を作成してください。
1次元配列の最大値と最小値を表示してください。
 */
public class Quiz13 {

	public static void main(String[] args) {
		int[][] array = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		int sumi = array.length;
		int sumj = array[0].length;
		int sumij = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sumij = sumij + array[i][j];
			}
		}
		System.out.println(sumij);
		
		
	}

}
