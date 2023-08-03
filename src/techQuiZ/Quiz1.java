package techQuiZ;

/**
 * 練習問題 1 - 0：以下のようなint型の配列を作成してください。{2, 5, 7, 8, 10, 12}。
 * この配列の要素のうち、3で割り切れるものだけを出力するコードを作成してください。
 */
public class Quiz1 {

	public static void main(String[] args) {

		int[] array = new int[] { 2, 5, 7, 8, 10, 12 };
		int sum = 3;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % sum == 0) {
				System.out.println(array[i]);
			}
		}
	}

}
