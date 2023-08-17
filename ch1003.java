package ch10;

/**
 * 質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂
字 = 3バイト。以下⽂字列のバイト数と桁数を求めてください。
 */
public class ch1003 {
	public static void main(String... args) {
		String value = "abced12345あいうえお１２３４５";
		// バイト数は？
		int byteCount = value.getBytes().length;
		System.out.println("バイト数は:" + byteCount);
		// 桁数は？
		int characterCount = value.length();
		System.out.println("桁数は:" + characterCount);
	}
}
