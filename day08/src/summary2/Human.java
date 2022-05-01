package summary2;

public class Human {
	String name;
	Human(String name) {
		this.name = name;
	}
	// 자료형이 달라서 오버로딩으로 처리하던 내용을 상속 이후 슈퍼클래스로 묶어서 처리한다
	// 다형성, 서브클래스에 의해 생성된 객체는 슈퍼클래스로 업캐스팅하여 일괄처리할 수 있다
	void give(Animal target) {
		System.out.println(name + "이 " + target.name + "에게 먹이를 준다");
	}
}
