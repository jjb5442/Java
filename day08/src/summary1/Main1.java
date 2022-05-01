package summary1;

class Human {
	String name;
	Human(String name) {
		this.name = name;
	}
	// 메서드 오버로딩, 하나의 함수이름으로 서로 다른 자료형의 매개변수를 처리하는 여러개의 정의를 만들 수 있다
	void give(Cat target) {
		System.out.println(name + "이 " + target.name + "에게 먹이를 준다");
	}
	void give(Dog target) {
		System.out.println(name + "이 " + target.name + "에게 먹이를 준다");
	}
}
class Cat {
	String name;
	Cat(String name) {
		this.name = name;
	}
}
class Dog {
	String name;
	Dog(String name) {
		this.name = name;
	}
}

public class Main1 {
	public static void main(String[] args) {
		Human h1 = new Human("강호동");
		Cat c1 = new Cat("구름이");
		Dog d1 = new Dog("해피");
		
		h1.give(c1);	// 강호동이 구름이에게 먹이를 준다
		h1.give(d1);	// 강호동이 해피에게 먹이를 준다
	}
}
