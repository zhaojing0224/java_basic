package ch06;

/**
 * 質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼
び出してください。
 */
public class T0602 {

	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int array[] = { 50, 80, 100 };
		int sum = sum(array);
		int max = max(array);
		int min = min(array);

		System.out.println("合計＝" + sum);
		System.out.println("最大値＝" + max);
		System.out.println("最小値＝" + min);

	}
}
