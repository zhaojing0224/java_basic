package techQuiZ;

/**
 * 練習問題 1 - 3:奇数のみの合計
int型の配列を作成し、配列内の奇数だけを合計して出力するプログラムを作成してください。
 */
public class Quiz4 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				sum = sum + array[i];
			}
		}
		System.out.println(sum);
	}
}