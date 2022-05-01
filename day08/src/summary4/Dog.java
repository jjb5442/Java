package summary4;

public class Dog extends Animal implements Companion {
	Dog(String name) {
		super(name);
	}
	@Override
	public String getName() {
		return name;
	}
}
