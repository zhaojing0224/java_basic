package ch03;

/**
* 質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４8
円のコイン数をもとめください。
*/
public class T0302 {

	public static void main(String[] args) {

		int sum = 3348;

		if (sum >= 500) {

			System.out.println("500円：" + sum / 500);

			sum = 3348 % 500;
		}
		if (sum >= 100) {
			System.out.println("100円：" + sum / 100);
			sum = sum % 100;
		}
		if (sum >= 10) {
			System.out.println("10円：" + sum / 10);
			sum = sum % 10;
		}
		if (sum >= 5) {
			System.out.println("5円：" + sum / 5);
			sum = sum % 5;
		}
		if (sum >= 1) {
			System.out.println("1円：" + sum / 1);
			sum = sum % 1;
		}
	}
}
