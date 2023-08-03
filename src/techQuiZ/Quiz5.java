package techQuiZ;

/**
 * 練習問題 1 - 4:配列内の最大値
int型の配列を作成し、配列内の最大値を求めて出力するプログラムを作成してください。
 */
public class Quiz5 {

	public static void main(String[] args) {
		int array[] = new int[] { 15, 6, 1, 9, 100, 81 };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("最大値は" + max);
	}

}
