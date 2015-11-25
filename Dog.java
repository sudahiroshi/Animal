/**
 * 犬を取り扱うクラス
 */
public class Dog extends Animal {
	/**
	 * 名前を受け取るコンストラクタ
	 * @param name 名前
	 */
	Dog( String name ) {
		super( "ワン", name );
	}

	/**
	 * 能力を返すメソッド
	 * @return 能力
	 */
	public String skill() {
		return "鼻が良い";
	}
}
