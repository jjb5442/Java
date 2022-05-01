package summary4;

public interface Companion {
	// 인터페이스의 필드는  static final이므로 여기에 name 필드를 작성하면 이름이 통일되어버리고 변경할수 없다
	// 필드 대신 메서드를 이용하면 된다 (객체 자신의 이름을 반환하는 메서드 => getter)
	String getName();
}
