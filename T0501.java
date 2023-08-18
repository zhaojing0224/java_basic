package ch05;

/**
 * 設問１︓1から100までの偶数の和を求める(for + if)。
 */
public class T0501 {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			int sum = 0;
			sum = sum + i;
			if (i % 2 == 0) {
				sum = i;
				System.out.println(sum + i);
			}
		}
	}

}
