package ch06;

/**
 * 質問６-１︓以下静的なメソッドを定義してください。
 * 1. メソッド名: megerArray
2. 引数１︓intの配列 left
3. 引数２︓intの配列 right
4. 戻り値︓intの配列
5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
 */
public class T0603 {

	public static int[] megerArray(int[] left, int[] right) {

		int[] array = new int[left.length + right.length];

		// マージ
		for (int i = 0; i < left.length; i++) {
			array[i] = left[i];
		}

		for (int j = 0; j < right.length; j++) {
			array[left.length + j] = right[j];
		}

		return array;
	}

	public static void main(String[] args) {
		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };

		int[] array = megerArray(left, right);

		printArray(array);
	}

	public static void printArray(int[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}
