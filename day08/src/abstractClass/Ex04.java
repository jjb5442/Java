package abstractClass;

// 인터페이스 : 추상 클래스 중에서도 특수한 형태
// 인터페이스의 모든 필드는 public static final 속성을 자동으로 가진다
// 인터페이스의 모든 메서드는 public abstract 속성을 자동으로 가진다
// 인터페이스는 일반 메서드를 가질 수 없다 (추상 클래스는 일반메서드도 포함할 수 있다)
// 인터페이스는 생성자를 작성할 수 없다
// 인터페이스는 클래스와 다르게 extends로 상속하지 않고, implements 키워드로 상속처리한다(구현한다)
// 인터페이스는 예외적으로 다중상속을 허용한다

interface Test1 {
//	Test1() {}	// Interfaces cannot have constructors
	
	int var1 = 1;	// The blank final field var1 may not have been initialized
	public static final int var2 = 2;
	
	void method1();	// {}	// Abstract methods do not specify a body
	public abstract void method2();
}

class Test2 implements Test1 {	// extends가 아니라 implements 로 상속처리한다

	@Override
	public void method1() {
		System.out.println("method1");
	}

	@Override
	public void method2() {
		System.out.println(this.getClass().getMethods()[0].getName());
		// 이 객체의 클래스의 메서드들 중에서 가장 첫번째 메서드의 이름을 가져와서 출력
	}	
}
// 인터페이스도 클래스이므로, 자료형으로 사용할 수 있다
// extends와 다르게 문법을 적용하니까, 슈퍼클래스에 상관없이 같은 인터페이스로 묶을 수 있다
// 같은 인터페이스를 적용해도, 서로 다른 메서드 내용을 가질 수 있다
public class Ex04 {
	public static void main(String[] args) {
		Test2 ob = new Test2();
		ob.method1();
		ob.method2();
	}
}
