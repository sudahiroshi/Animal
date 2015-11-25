/**
 * 動物を取りまとめるクラス
 */
public class Animal {
	String voice;
	String name;

	/**
	 * 名前と鳴き声を受け取るコンストラクタ
	 * @param voice 鳴き声
	 * @param name 名前
	 */
	Animal( String voice, String name ) {
		this.voice = voice;
		this.name = name;
	}

	/**
	 * 名前のみを受け取るコンストラクタ
	 * @param name 名前
	 */
	Animal( String name ) {
		this.name = name;
	}

	/**
	 * 鳴き声を返すメソッド
	 * @return 鳴き声
	 */
	String bark() {
		return this.voice;
	}

	/**
	 * 名前を返すメソッド
	 * @return 名前
	 */
	String getName() {
		return this.name;
	}

	/**
	 * 表示に使用されるメソッド
	 * @return 名前と鳴き声
	 */
	@Override public String toString() {
		return "名前：" + this.getName() + ", 鳴き声：" + this.bark();
	}
}
