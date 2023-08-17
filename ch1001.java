package ch10;

/**
 * 質問１︓以下３⾏⽂字列を「改⾏コード」と「,」を分割して２つペットオブジェクトを
作成してください。
1. Petクラスを事前作成してください。
2. ペットのタイプは列挙型である︓type = 0︓猫、type = 1︓⽝
ペット病院⽤ペットマスタデータは以下通りです。（ファイルから読み取り不要）※トリ
ム注意
1.name, age, type
2.みみ, 10, 1
3.レオ, 1, 0
4.マル,2,0
 */
public class ch1001 {
	public static class Pet {
		public enum PetType {
			cat, dog;
		}

		private String name;
		private int age;
		private PetType type;

		public Pet(String name, int age, PetType type) {
			this.name = name;
			this.age = age;
			this.type = type;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public PetType getType() {
			return type;
		}
	}

	public class Main {
		public void main(String[] args) {
			String data1 = "みみ, 10, 1";
			String data2 = "レオ, 1, 0";
			String data3 = "マル,2,0";

			String[] petData = { data1, data2, data3 };

			for (String data : petData) {
				//“增强型 for 循环”（或“foreach 循环”）的语法。
				//用于迭代访问集合（如数组、列表等）中的元素，而不需要使用传统的索引来操作。
				String[] parts = data.split(", ");
				//将 data 字符串按照 ", " 进行拆分，并将拆分后的部分存储在一个字符串数组 parts 中。
				String name = parts[0];
				int age = Integer.parseInt(parts[1]);
				int typeValue = Integer.parseInt(parts[2]);
				Pet.PetType type = (typeValue == 0) ? Pet.PetType.cat : Pet.PetType.dog;

				Pet pet = new Pet(name, age, type);
				System.out.println("名前:" + pet.getName() + "、年齢:" + pet.getAge() + "、タイプ:" + pet.getType());

			}
		}
	}
}
