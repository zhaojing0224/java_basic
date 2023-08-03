package techQuiZ;

/**
 * 練習問題 1 - 5:配列内の最小値
int型の配列を作成し、配列内の最小値を求めて出力するプログラムを作成してください。
 */
public class Quiz6 {

	public static void main(String[] args) {
		int array[] = new int[] { 2, 69, 71, 95, 28, 1 };
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("最小値は" + min);
	}

}
