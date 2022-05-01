package collection;

import java.util.ArrayList;

// 앞으로의 자바 공부 내용
// 자바 컬렉션 프레임워크 : 여러 객체를 효율적으로 관리하는 자료구조, 자바 기본 라이브러리에 포함됨
// 예외 : 자바코드에서 발생하는 여러 예외상황을 처리하는 방법
// 스레드 : 동시에 여러 코드를 실행하고 싶을때 사용하는 클래스
// 파일 : 자바에서 데이터를 파일에 저장하거나, 파일의 내용을 불러오는 방법
// 기타 유틸 클래스들, 자바 API : 자주 사용되는 클래스, 자바 공식 사이트에 있는 API문서 읽기
// 네트워크, GUI, Web...

public class Ex06 {
	public static void main(String[] args) {
		// 다수의 데이터를 처리하기 위한 자료형 배열이 있지만 여러 제약이 있다
		// 여러 데이터를 어떤 형태로 저장하냐에 따라서 관리 및 추가 삭제의 효율이 달라진다
		// 다수의 데이터를 효율적으로 처리하기 위한 클래스가 준비되어 있고, 사용법을 익혀본다
		// 1) 리스트 : 배열과 비슷하게 데이터를 선형으로 관리하는 자료구조
		// 리스트는 순번이 있고, 데이터의 중복을 허용하는 자료구조 (배열과 비슷함)
		// java.util.List : 인터페이스, 객체를 생성할 수 없다. 대신 List를 구현한 다른 클래스를 사용
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add("ITBANK");
		list.add(20);
		
		// add() 함수를 이용하여 데이터를 추가할 수 있고, 데이터를 추가할때마다 길이가 자동으로 증가한다
		// 배열은 길이가 처음부터 정해져있고, 길이를 변경할 수 없다
		
		System.out.println("리스트의 크기 : " + list.size()); 	// 함수를 이용하여 크기를 확인할 수 있다
		
		// 배열과 마찬가지로 인덱스를 이용하여 리스트의 멤버 요소를 확인할 수 있다
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 리스트의 i번째 요소를 참조할 때는 get(index) 함수를 사용
		}
		System.out.println();
		
		list.remove(new Integer(20)); 	// 10이라는 값(객체)를 찾아서 삭제한다
		list.remove(1);					// 1번째 요소를 찾아서 삭제한다
		
		// remove(Object o) : o를 찾아서 삭제한다 (크기가 자동으로 조절된다)
		// remove(int index) : index번째 요소를 찾아서 삭제한다 (크기가 자동으로 조절된다)
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		} System.out.println();
		System.out.println("리스트의 크기 : " + list.size()); 	
		
		// 기본적으로 컬렉션은 모든 형태의 객체(Object)를 처리할 수 있다
		// 이는 단점으로 작용하는 경우가 더 많다
		// 컬렉션 내부에 자료가 어떤 형태인지 명시하는 문법이 별도로 존재한다
		// 제네릭 타입을 지정해야 한다 (일반적으로 처리되는 자료형을 지정할 수 있다)
		
		
		
		
		
		
		
	}
}
