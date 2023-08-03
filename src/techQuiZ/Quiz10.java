package techQuiZ;

/**
 * 練習問題 1 - 9：以下のような整数の配列があります。
int[] arr = {1, 2, 3, 4, 5};
この配列から、異なる3つの数値をすべて選び、その組み合わせの積をすべて求めてください。
すなわち、1 × 2 × 3、1 × 2 × 4、1 × 2 × 5、1 × 3 × 4、1 × 3 × 5、1 × 4 × 5、
2 × 3 × 4、2 × 3 × 5、2 × 4 × 5、3 × 4 × 5 の10個の数値を出力してください。
 */
public class Quiz10 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int a = 0; a < array.length; a++) {
			for (int b = a + 1; b < array.length; b++) {
				for (int c = b + 1; c < array.length; c++) {
					sum = array[a] * array[b] * array[c];
					System.out.println(sum);
				}
			}
		}
	}

}
