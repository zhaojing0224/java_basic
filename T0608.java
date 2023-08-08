package ch06;

import java.util.Arrays;

/**
 * 質問８︓バブルソート⽤メソッドを作成してください。
 * 1. メソッド名︓bubbleSort
2. 引数１︓intの配列
3. 戻り値︓ソート済みの配列
4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
い。
 */
public class T0608 {

	public static void main(String[] args) {

		int[] array = new int[] { 8, 225, 6, 96, 10, 2, 88 };

		int[] res = bubbleSort(array);
		System.out.println(Arrays.toString(res));
	}

	public static int[] bubbleSort(int[] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {
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
