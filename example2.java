public class example2 {
	public static void main( String[] args ) {
		Zoo foo = new Zoo();

		foo.push( new Dog( "ラッシー" ) );
		foo.push( new Dog( "ジョリー" ) );
		foo.push( new Cat( "アカマル" ) );

		System.out.println( foo.getAnimal(0) );

		foo.push( new Cat( "ミケ" ) );
		foo.push( new Animal( "ハハ！", "ミッキー" ) );
		foo.push( new Animal( "グワグワ", "ドナルド" ) );

		for( int i=0; i<foo.getLength(); i++ ) {
			System.out.println( foo.getAnimal( i ) );
		}
	}
}
