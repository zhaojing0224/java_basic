package ch05;

/**
 * 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
 */
public class ch0503 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 6, 7, 9, 6, 2, 1 };

		int max = array[0];
		int min = array[0];
		int sum = 0;

		for (int num : array) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
			sum += num;
		}

		int average = sum / array.length;

		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
		System.out.println("合計：" + sum);
		System.out.println("平均値：" + average);
	}

}
