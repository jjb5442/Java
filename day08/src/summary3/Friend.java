package summary3;

// 자바의 클래스는 다중상속을 허용하지 않는다
// Friend는 분류상으로도 Animal을 상속하기 적합하지 않다

public class Friend extends Human {
	Friend(String name) {
		super(name);
	}
}
