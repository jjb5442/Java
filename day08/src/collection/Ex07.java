package collection;

import java.util.ArrayList;
import java.util.Comparator;

class Member {
	String name;
	int age;
	
	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {	// 오버라이딩, Object 클래스에 정의되어 있음
		return String.format("%s : %d살", name, age);
	}
	
	void show() {				// 고유 메서드, Object에 정의되어 있지 않음
		System.out.println(this.toString());
	}
}

public class Ex07 {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<Member>();
		Member m1 = new Member("이지은", 30);
		Member m2 = new Member("나단비", 5);
		Member m3 = new Member("홍진호", 41);
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		// 배열과 달리, 컬렉션은 toString()이 오버라이딩 되어 있다
		// 제네릭 타입으로 지정된 클래스도 toString()이 오버라이딩 되어 있으면 곧바로 출력할 수 있다
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			list.get(i).show();		// 제네릭 타입이 Member라면 굳이 다운캐스팅이 필요없다
		}
		
		ArrayList list2 = new ArrayList();
		list2.add(m1);
		list2.add(m2);
		list2.add(m3);
		
		for(int i = 0; i < list2.size(); i++) {
//			list2.get(i).show();	// 내부 요소가 Object라면 show()를 호출할 수 없다
			((Member)list2.get(i)).show();// 다운캐스팅을 직접 해야 함수를 호출할 수 있다
		}
		
		// primitive 타입의 데이터를 담는 리스트를 만들려면 wrapperClass로 지정한다
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(2);
		list3.add(7);
		list3.add(8);
		list3.add(4);
		list3.add(6);
		
		// 컬렉션은 데이터 추가삭제이외에도 사용하기 편리한 여러 함수를 지원한다
		System.out.println(list3);
		list3.sort(null);			// list3를 정렬한다 (정렬 기준은 별도로 전달하지 않는다)
		System.out.println(list3);
		
		// 문자열의 리스트
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("이지은");
		list4.add("나단비");
		list4.add("홍진호");
		System.out.println(list4);
		list4.sort(null);
		System.out.println(list4);
		
		// Member의 리스트	(내가 직접 작성한 클래스는 어떤 값을 기준으로 어떻게 정렬할지 지정해야 한다)
		System.out.println(list);
		MemberSort comp = new MemberSort();
		list.sort(comp);	// 정렬 기준을 담고있는 객체 comp
		System.out.println(list);
		
		Comparator<Member> comp2 = (Member o1, Member o2) -> o2.age - o1.age;
		list.sort(comp2);
		System.out.println(list);
		
		list.add(new Member("김희철", 40));
		
		list.sort((Member o1, Member o2) -> {
			return o1.name.compareTo(o2.name);
		}); 
		System.out.println(list);
	}
}

class MemberSort implements Comparator<Member> {	

	@Override	// Comparator인터페이스가 가지는 추상메서드
	public int compare(Member o1, Member o2) {	
		return o1.age - o2.age > 0 ? 1 : -1;
		// 0보다 큰값인지, 0보다 작은값인지 반환하면 반환값을 기준으로 정렬해준다
	}
}





