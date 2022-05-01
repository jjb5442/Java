package abstractClass;

import java.util.Scanner;

abstract class Button /* extends Object */ {	// 추상 클래스
	String name;
	abstract void click() throws Exception;		// 추상 메서드 (내용 없음)
	
	Button(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "<" + name + ">";
	}
}

class NotepadButton extends Button {
	
	NotepadButton(String name) {
		super(name);
	}
	
	@Override
	void click() throws Exception {		// 오버라이딩하면서 내용을 만들었음
		Runtime.getRuntime().exec("notepad");
	}
}

public class Ex03 {
	public static void main(String[] args) throws Exception {
		// 추상클래스를 활용하여 객체를 생성하기
		// 1) 추상클래스를 상속받은 일반 클래스를 작성하고, 함수를 오버라이딩하기
		NotepadButton btn1 = new NotepadButton("메모장");
//		btn1.click();
		
		// 2) 익명클래스형태로 객체를 생성하기 (미구현된 메서드의 내용만 오버라이딩하면 가능)
		// 지정한 형식의 객체를 여러개 만들필요가 없고 내용만 간단하게 구현하여 객체를 생성하고 싶은 경우
		Button btn2 = new Button("그림판") {
			@Override	// 오버라이딩 : 상속받은 메서드를 재정의
			void click() throws Exception {
				Runtime.getRuntime().exec("mspaint");	// 그림판
			}
		};
//		btn2.click();
		
		// Button : 클릭 함수가 있고, 클릭하면 어떠한 내용(결정되지 않음)이 실행되는 객체를 위한 클래스
		// 위 클래스에서 내용만 결정되면 객체를 생성할 수 있다
		
		Button btn3 = new Button("탐색기") {
			@Override
			void click() throws Exception {
				Runtime.getRuntime().exec("explorer"); // 윈도우 탐색기
			}
		};
		
		Button[] arr = { btn1, btn2, btn3 };
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		do {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(i + 1);
				System.out.println(arr[i]); 	// 객체를 출력하면 toString()으로 변환하여 출력됨
			}
			System.out.print("메뉴 선택 (0은 종료) >>> ");
			menu = sc.nextInt();
			
			if(menu != 0) {
				arr[menu - 1].click();
			}
		} while(menu != 0);
		sc.close();
	}
}
