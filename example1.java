public class example1 {
	public static void main( String[] args ) {
		Animal animal1 = new Animal( "コンコン", "ゴンぎつね" );
		Dog animal2 = new Dog( "ポチ" );
		Cat animal3 = new Cat( "タマ" );

		System.out.println( "animal1の名前: " + animal1.getName() );
		System.out.println( "animal1の鳴き声: " + animal1.bark() );
		System.out.println( "animal2の名前: " + animal2.getName() );
		System.out.println( "animal2の鳴き声: " + animal2.bark() );
		System.out.println( "animal3の名前: " + animal3.getName() );
		System.out.println( "animal3の鳴き声: " + animal3.bark() );
	}
}
