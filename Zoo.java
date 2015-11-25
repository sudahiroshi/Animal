public class Zoo {
	private Animal[] cage;
	private int length = 0;

	Zoo() {
		this.cage = new Animal[ 10 ];
	}

	Zoo( int number ) {
		this.cage = new Animal[ number ];
	}

	public void push( Animal who ) {
		if( this.length < cage.length ) {
			cage[ this.length ] = who;
			this.length++;
		}
	}

	public Animal getAnimal( int number ) {
		return this.cage[ number ];
	}

	public int getLength() {
		return this.length;
	}
}
