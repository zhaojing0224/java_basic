package techQuiZ;

/**
 * 練習問題 1 - 1：以下のようなdouble型の配列を作成してください。{1.2, 2.4, 3.6, 4.8, 6.0}。
 * この配列の要素の平均値を計算して出力するコードを作成してください。
 */
public class Quiz2 {

	public static void main(String[] args) {

		double[] array = new double[] { 1.2, 2.4, 3.6, 4.8, 6.1 };
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
		}
		System.out.println(sum / array.length);
	}

}
