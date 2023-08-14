package ch07;

public class Ch0701 {

	public class Human {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	// Kicker.java
	public class Kicker {
		public static void main(String... args) {
			Human obj = new Human();
			System.out.println(obj.getName());// Nullpointer：obj = null;
		}
	}
}
