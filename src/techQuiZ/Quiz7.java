package techQuiZ;

/**
 * 練習問題 1 - 6:以下のような複数の行列が与えられます。
[[1, 2], [3, 4]]
[[5, 6], [7, 8]]
[[9, 10], [11, 12]]
これらの行列をすべて加算した行列を求めてください。ただし、すべての行列の次元が同じであるとします。
 */
public class Quiz7 {

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2 }, { 3, 4 } };
		int[][] matrix2 = { { 5, 6 }, { 7, 8 } };
		int[][] matrix3 = { { 9, 10 }, { 11, 12 } };

		int[][] result = new int[matrix1.length][matrix1[0].length];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j] + matrix3[i][j];
			}
		}

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println( );
		}
	}

}
