package ch08;

/**
 * 質問３︓以下コンパイルを修正してください。
 */
public class ch0801 {
	// Parent.java
	public class Parent {
		public void hello() {
			System.out.println("parent method");
		}
	}

	// Child.java
	public class Child extends Parent {
		@Override // 親クラスの強制的にOverrideする意味（アノテーション）
		public void hello() {
			System.out.println("child method");
		}
	}

	// Kicker.java
	public class Kicker {
		public void print(Parent v) {
			v.hello();
		}

		public void main(String... args) {
			print(new Parent());
			print(new Child());
		}
	}
}