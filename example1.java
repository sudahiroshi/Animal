public class example1 {
	public static void main( String[] args ) {
		Animal animal1 = new Animal( "コンコン", "ゴンぎつね" );
		Animal animal2 = new Dog( "ポチ" );
		Animal animal3 = new Cat( "タマ" );

		System.out.println( animal1 );
		System.out.println( animal2 );
		System.out.println( animal3 );
	}
}
