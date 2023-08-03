package techQuiZ;

/**
 * 練習問題 2- 3:ある人がテストを受けた結果、10科目の点数が出ました。
 * この点数の平均点と合計点を求めるプログラムを作成してください。
 */
public class Quiz14 {

	public static void main(String[] args) {
		int[] array = new int[] { 91, 80, 85, 70, 99, 50, 78, 89, 95, 100 };
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double average = (double) sum / array.length;
		System.out.println("平均点=" + average);
		System.out.println("合計点＝" + sum);
	}

}
