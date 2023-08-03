package techQuiZ;

/**
 * 練習問題 2- 1:以下の仕様に従って、2つの2次元配列の掛け算を行うプログラムを作成してください。
2つの2次元配列a,bは共に3行3列の行列である。
配列a,bの要素はすべて0以上10以下の整数である。
a,bの掛け算の結果を2次元配列cに格納する。
配列cを出力する。
 */
public class Quiz12 {

	public static void main(String[] args) {
		int[][] arraya = new int[][] { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };
		int[][] arrayb = new int[][] { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int[][] arrayc = new int[3][3];
		for (int i = 0; i < arraya.length; i++) {
			for (int j = 0; j < arrayb[i].length; j++) {
				for (int k = 0; k < arrayb.length; k++) {
					arrayc[i][j] += arraya[i][k] * arrayb[k][j];
				}
			}
		}
		for (int i = 0; i < arrayc.length; i++) {
			for (int j = 0; j < arrayc[i].length; j++) {
				System.out.print(arrayc[i][j] + " ");
			}
			System.out.println();
		}
	}
}
