package ch10;

/**
 * 質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似て
いるメソッドを実装してください。
 */
public class ch1004 {
	public static boolean nullOrEmpty(String value) {
		// value は null or Empty 判断してください。
		return value == null || value.isEmpty();
	}

	public static void main(String[] args) {
		String value1 = null;
		String value2 = "";
		String value3 = "0";

		System.out.println(nullOrEmpty(value1));
		System.out.println(nullOrEmpty(value2));
		System.out.println(nullOrEmpty(value3));
	}
}
