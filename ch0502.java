package ch05;

/**
 * 設問２︓5の階乗を求める(for)。
 */
public class ch0502 {
	public static void main(String[] args) {
		int reslut = 1;

		for (int i = 1; i <= 5; i++) {
			reslut = reslut * i;
		}
		System.out.println(reslut);
	}
}
