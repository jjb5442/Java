package summary4;

public class Cat extends Animal implements Companion {
	Cat(String name) {
		super(name);
	}
	@Override
	public String getName() {
		return name;
	}
}
