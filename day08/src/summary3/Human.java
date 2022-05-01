package summary3;

public class Human {
	String name;
	Human(String name) {
		this.name = name;
	}
	// 자료형이 달라서 오버로딩으로 처리하던 내용을 상속 이후 슈퍼클래스로 묶어서 처리한다
	// 다형성, 서브클래스에 의해 생성된 객체는 슈퍼클래스로 업캐스팅하여 일괄처리할 수 있다
	void give(Animal target) {
		// 다형성에 의해 슈퍼클래스 타입으로 받았지만, 서브클래스로 구분해야 한다면
		// instanceof를 사용할 수 있다
		String feed = "먹이";
		if(target instanceof Cat) feed = "츄르";
		if(target instanceof Dog) feed = "사료";
		System.out.println(name + "이 " + target.name + "에게 " + feed + "를 준다");
	}
	
	// 같은 슈퍼클래스로 묶을 수 없다면 오버로딩해야 한다
	void give(Friend target) {
		String feed = "커피";
		System.out.println(name + "이 " + target.name + "에게 " + feed + "를 준다");
	}
}
