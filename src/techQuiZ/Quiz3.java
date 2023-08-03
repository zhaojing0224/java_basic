package techQuiZ;

/**
 * 練習問題 1 - 2：配列要素の合計
int型の配列を作成し、配列の要素の合計を計算して出力するプログラムを作成してください。
 */
public class Quiz3 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int sum = 0;
		int i = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= array.length);
		System.out.println("sum=" + sum);
	}
}
