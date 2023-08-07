package ch06;

import java.util.Arrays;

/**
 * 質問７︓以下静的なメソッドを定義してください
 * 1. メソッド名︓trim
2. 引数１︓charの配列
3. 戻り値︓charの配列
4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
 */
public class T0607 {

	public static char[] trimChar(char[] array) {

		int startIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != ' ') {
				startIndex = i;
				break;
			}
		}

		int endIndex = 0;
		for (int i = array.length - 1; i < array.length; i--) {
			if (array[i] != ' ') {
				endIndex = i;
				break;
			}
		}

		char[] output = new char[endIndex - startIndex + 1];
		for (int i = 0; i < array.length; i++) {

			if (i >= startIndex && i <= endIndex) {
				output[i - startIndex] = array[i];
			}
		}

		return output;
	}

	public static void main(String[] args) {
		char[] array = new char[] { ' ', ' ', 'A', 'B', ' ', ' ', 'C', ' ' };
		char[] res = trimChar(array);
		System.out.println(Arrays.toString(res));
		printArray(res);
	}

	public static void printArray(char[] array) {
		if (array == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (char obj : array) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}
