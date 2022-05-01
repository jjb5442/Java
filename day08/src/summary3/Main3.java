package summary3;

public class Main3 {
	public static void main(String[] args) {
		Human h1 = new Human("강호동");
		Cat c1 = new Cat("구름이");
		Dog d1 = new Dog("해피");
		Friend f1 = new Friend("이수근");
		
		h1.give(c1);	// 강호동이 구름이에게 먹이를 준다
		h1.give(d1);	// 강호동이 해피에게 먹이를 준다
		h1.give(f1);
	}
}
