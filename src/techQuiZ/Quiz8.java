package techQuiZ;

/**
 * 練習問題 1 - 7:以下のような複数の文字列が与えられます。
["apple", "banana", "grape", "orange"]
この文字列を逆順にして表示してください。
 */
public class Quiz8 {

	public static void main(String[] args) {
		String[] fruits = { "apple", "banana", "grape", "orange" };
		for (int i = fruits.length - 1; i >= 0; i--) {
			System.out.println(fruits[i]);
		}
	}

}
