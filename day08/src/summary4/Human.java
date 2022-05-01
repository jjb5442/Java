package summary4;

public class Human {
	String name;
	Human(String name) {
		this.name = name;
	}
	// 자료형이 달라서 오버로딩으로 처리하던 내용을 상속 이후 슈퍼클래스로 묶어서 처리한다
	// 다형성, 서브클래스에 의해 생성된 객체는 슈퍼클래스로 업캐스팅하여 일괄처리할 수 있다
	// 서로 다른 슈퍼클래스를 가지는 각각의 클래스를 하나의 인터페이스로 묶어서 처리할 수 있다
	void give(Companion target) {
		// 다형성에 의해 슈퍼클래스 타입으로 받았지만, 서브클래스로 구분해야 한다면
		// instanceof를 사용할 수 있다
		String feed = "먹이";
		if(target instanceof Cat) 		feed = "츄르";
		if(target instanceof Dog) 		feed = "사료";
		if(target instanceof Friend)	feed = "커피";
//		System.out.println(name + "이 " + target.name + "에게 " + feed + "를 준다");
		System.out.println(name + "이 " + target.getName() + "에게 " + feed + "를 준다");
	}
}
