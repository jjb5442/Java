package abstractClass;

// 추상 클래스 : 추상 메서드를 포함할 수 있는 클래스, 일반 메서드도 포함할 수 있다 (객체를 생성할 수 없다)
// 추상 메서드 : 형태는 있으나 내용이 없는 추상적인 메서드, 서브클래스가 상속받으면서 오버라이딩 할 수 있다

abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	abstract void bark();	// 형태만 있고, 내용이 없다 (일반 클래스는 추상메서드를 포함할 수 없다)
	void test() {
		System.out.println("추상 클래스는 일반 메서드도 작성할 수 있다");
	}
}
class Dog extends Animal {
	Dog(String name) {
		super(name);
	}
	@Override
	void bark() {	// 추상메서드를 오버라이딩하여 내용을 만들어주면 된다
		System.out.println(name + " : 멍멍");
	}
}

public class Ex02 {
	public static void main(String[] args) {
//		Animal a1 = new Animal("동물");		// 추상 클래스는 생성자를 이용한 객체 생성 불가능
//		Cannot instantiate the type Animal
		Animal a1 = new Dog("해피");	// 강아지 객체를 생성하여 동물 형태로 참조한다
		a1.bark();
		// 1) Animal에는 추상메서드이긴하지만, bark() 함수가 정의되어 있다 (실행 가능)
		// 2) 객체는 Dog형태로 생성했었고, Dog에 정의된 bark는 멍멍을 출력하게 되어있다(내용은 오버라이딩)
	}
}
