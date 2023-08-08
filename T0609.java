package ch06;

/**
 * 質問９︓メソッドの呼び出す練習。
 * 1. 質問６-１を⽤い、２つ配列をマージします。
2. 質問８を⽤い、ステップ１のマージした配列をソートする。
3. 注意︓コードを１⾏にしてください。
 */
public class T0609 {

	public static int[] megerArray(int[] array1, int[] array2) {

		int[] array = new int[array1.length + array2.length];

		for (int i = 0; i < array1.length; i++) {
			array[i] = array1[i];
		}

		for (int j = 0; j < array2.length; j++) {
			array[array1.length + j] = array2[j];
		}

		return array;
	}

	public static void main(String[] args) {
		int[] array1 = new int[] { 5, 2, 3, 4 };
		int[] array2 = new int[] { 9, 6, 1, 8 };

		int[] array = megerArray(array1, array2);
		int[] res = bubbleSort(array);
		printArray(res);
	}

	public static void printArray(int[] res) {
		if (res == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int obj : res) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

	public static int[] bubbleSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (i == j) {
					continue;
				}
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		return array;
	}
}
