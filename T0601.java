package ch06;

/**
 * 実例︓重⼒加速度 y = g*t*t/2 は以下関数で定義する。
 */
public class T0601 {

	public static float gAcceleration(float t) {
		float y = 9.8F * t * t / 2;
		return y;
	}

}
