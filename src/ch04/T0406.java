package ch04;

public class T0406 {
//問題１の配列のSUMを求める。(問題１:int[] array = new int[4]; 各要素の値を記載してください)//
	public static void main(String[] args) {
		int[] array = new int[] {0,0,0,0};
		int sum = 0;
		int i =0;
		do
		{  sum= sum + array[i];
			i++; 
		}
		while(i <= array[i]);
			System.out.println("sum="+sum);
		}
	}
