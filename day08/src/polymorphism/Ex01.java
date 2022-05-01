package polymorphism;

// 자바 객체 지향의 4가지 특성
// 캡슐화	: 변수와 함수를 하나의 객체로 묶어서 처리할 수 있다. 내부 데이터에 임의로 접근할 수 없다
// 상속	: 기존 클래스를 활용하여 개념을 확장한 새로운 클래스를 만들 수 있다 
// 추상화	: 상속의 오버라이딩을 목적으로 형태만 만들어진 추상적인 함수 및 클래스를 작성할 수 있다
// 다형성	: 하나의 객체는 슈퍼클래스로도 참조할 수 있고, 서브클래스로도 참조할 수 있다

class Animal {	// 여러 유형의 동물들을 하나의 분류(카테고리)로 구별하기 위한 개념적인 유형
	String name;
	Animal(String name) {
		this.name = name;
	}
	void bark() {	// 동물의 울음소리를 표현하는 함수
		System.out.println(name + " : ...");
	}	// 이 내용은 실제로 실행된 경우가 없다. 단지 오버라이딩을 위한 형태
}
class Dog extends Animal {
	Dog(String name) {
		super(name);
	}
	@Override
	void bark() {		// 상속받아서 재정의한 함수 (슈퍼클래스에 정의되어 있다)
		System.out.println(name + " : 멍멍");
	}
	
	void tailing() {	// 서브클래스에서 새로 만들어진 함수 (슈퍼클래스에 정의되어 있지 않다)
		System.out.println(name + "가 꼬리를 흔든다");
	}
}
class Cat extends Animal {
	Cat(String name) {
		super(name);
	}
	@Override
	void bark() {
		System.out.println(name + " : 야옹");
	}
	
	void grooming() {
		System.out.println(name + "가 털을 핥는다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Dog d1 = new Dog("해피");
		Cat c1 = new Cat("구름이");
		
		c1.bark();
		d1.bark();
		
		c1.grooming();
		d1.tailing();
		
		System.out.println();
		
		Animal a1 = d1;		// 강아지는 동물이다
		Animal a2 = c1;		// 고양이는 동물이다
		
		a1.bark();	// 1) 정의되어 있으니까 호출 가능
		a2.bark();	// 2) 호출된다면 객체의 메서드는 오버라이딩(재정의)된 상태이므로, 서브클래스내용대로 실행된다
		
//		a1.grooming();		// grooming, tailing은 각 서브클래스에만 있는 고유함수이다
//		a2.tailing();		// 슈퍼클래스 Animal에 정의되지 않았으니, Animal상태에서 호출할 수 없다
		
		Cat c2 = null;
		Dog d2 = null;
		
		if(a1 instanceof Cat) 	c2 = (Cat)a1;
		if(a1 instanceof Dog)	d2 = (Dog)a1;
		if(a2 instanceof Cat)	c2 = (Cat)a2;
		if(a2 instanceof Dog)	d2 = (Dog)a2;
		
		c2.grooming();	// 강아지나 고양이의 고유 기능을 호출하려면 다운캐스팅을 해야한다
		d2.tailing();	// 다운캐스팅 전에 해당 클래스의 객체인지 확인(instanceof)하고 형변환해준다
		
		// 객체의 메서드를 호출하려면
		// 현재 객체를 참조하고 있는 자료형(클래스)에 함수가 정의되어 있어야 한다 (내용은 중요하지 않음)
		// 만약 호출가능한 상태라면 객체가 최초 생성된 자료형에 따라 오버라이딩 함수가 실행된다
		
		// 서브클래스의 오버라이딩 함수는 up-casting된 상태에서도 곧바로 호출할 수 있다
		// 서브클래스의 고유 함수는 down-casting을 진행해야 호출할 수 있다
	}
}
