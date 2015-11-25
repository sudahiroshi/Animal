/**
 * 猫を取り扱うクラス
 */
public class Cat extends Animal {
	/**
	 * 名前を受け取るコンストラクタ
	 * @param name 名前
	 */
	Cat( String name ) {
		super( "にゃー", name );
	}

	/** 能力を返すメソッド
	 * @return 能力
	 */
	String skill() {
		return "木登り";
	}
}
