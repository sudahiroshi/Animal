public class Animal {
	String voice;
	String name;

	Animal( String voice, String name ) {
		this.voice = voice;
		this.name = name;
	}

	Animal( String name ) {
		this.name = name;
	}

	String bark() {
		return this.voice;
	}

	String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "名前：" + this.getName() + ", 鳴き声：" + this.bark();
	}
}
