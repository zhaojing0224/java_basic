package ch04;

public class T0405 {
	//問題５:int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値をSystem.out.println()//
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("最大值：" + max);
		System.out.println("最小值：" + min);
	}
}
