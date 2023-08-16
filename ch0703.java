package ch07;

/**
 * 質問１︓以下コードのコンパイルエラー理由を教えてください。
 */
public class ch0703 {
	// Pet.java
	public class Pet {
		public String name;
		public int age;

		public void setName(String value) {
			this.name = value;
		}

		public void setAge(int value) {
			this.age = value;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
	}

	// Kicker.java
	public class Kicker {
		public void main(String... args) {
			Pet cat = new Pet();
			cat.setName("cat");
			cat.setAge(1234);

		}
	}
}
