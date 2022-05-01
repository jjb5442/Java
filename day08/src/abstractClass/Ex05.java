package abstractClass;

interface USB {						// 인터페이스는 서로 다른 객체의 규격을 통일할 때 사용할 수 있다
	String version = "USB 3.0";
	void reaction();	// 내용을 가질 수 없다
}
class Speaker implements USB {	// 출력장치
	@Override
	public void reaction() {
		System.out.println("스피커 연결됨. 볼륨 20" + " (" + version + ")"); 
	}	
}
class Cable implements USB {	// 전력 및 데이터 전송 장치
	@Override
	public void reaction() { 
		System.out.println("휴대폰 연결됨. 전원 충전 중..." + " (" + version + ")");
	}	
}
class ExternalHDD implements USB {// 데이터 보관 장치
	@Override
	public void reaction() {
		System.out.println("외장 하드 연결됨. E:\\ 500GB" + " (" + version + ")");
	}	
}
class PC {
//	void connect(Speaker ob) {}
//	void connect(Cable ob) {}
//	void connect(ExternalHDD ob) {}
	void connect(USB ob) {	// USB형태의 장치를 연결하면
		ob.reaction();		// 해당 장치에 따라 반응이 나타난다
	}
}

public class Ex05 {
	public static void main(String[] args) {
		PC pc = new PC();
		
		Cable cable = new Cable();
		ExternalHDD hdd = new ExternalHDD();
		Speaker speaker = new Speaker();
		
		pc.connect(cable);
		pc.connect(hdd);
		pc.connect(speaker);
		
		// 인터페이스 중에서도 추상메서드 하나만 가지고 있는 형태를 함수형 인터페이스라고 부른다
		// 함수형 인터페이스는 익명클래스보다 더 간편하게 객체를 생성할 수 있다 (람다식 객체 생성)
		// FunctionalInterface
		
		USB mouse = () ->  { System.out.println("마우스 연결됨..."); }; // 람다식 객체 생성
		pc.connect(mouse);
		
		USB miniFan = new USB() {	// 익명 클래스를 활용한 객체 생성
			@Override
			public void reaction() {
				System.out.println("미니 선풍기 충전중...");
			}
		};
		pc.connect(miniFan);
	}
}
