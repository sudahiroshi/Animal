/**
 * Animalのインスタンスを蓄えるクラス
 */
public class Zoo {
	private Animal[] cage;
	private int length = 0;

	/**
	 * コンストラクタ（動物は10で決め打ち）
	 */
	Zoo() {
		this.cage = new Animal[ 10 ];
	}

	/**
	 * 動物の数を受け取るコンストラクタ
	 * @param number 動物の初期数
	 */
	Zoo( int number ) {
		this.cage = new Animal[ number ];
	}

	/**
	 * 動物を蓄えるメソッド
	 * @param who 動物（Animalクラスまたはその子クラスのインスタンス）
	 */
	public void push( Animal who ) {
		if( this.length < cage.length ) {
			cage[ this.length ] = who;
			this.length++;
		}
	}

	/**
	 * 番号を指定すると動物を返すメソッド
	 * @param number 番号
	 * @return 動物
	 */
	public Animal getAnimal( int number ) {
		return this.cage[ number ];
	}

	/**
	 * 蓄えている動物の数を返すメソッド
	 * @return 動物の数
	 */
	public int getLength() {
		return this.length;
	}
}
