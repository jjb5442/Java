package collection;

import java.util.HashMap;
import java.util.HashSet;

public class Ex08 {
	public static void main(String[] args) {
		// List : 순서가 있고, 값의 중복을 허용하는 자료구조
		// Set : 순서가 없고, 값의 중복을 허용하지 않는 자료구조
		// Map : 정수형태의 순서 대신, 별도형식의 key를 이용하여 value에 접근하는 자료구조
		//		 key는 중복될 수 없고, value는 중복될 수 있다
		
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println("set의 크기 : " + set.size());
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		
		System.out.println(set);
		System.out.println("set의 크기 : " + set.size());
		
		// 순번(index)가 없어서 일반적인 for문으로는 값을 각각 출력할 수 없다
		for(int i = 0; i < set.size(); i++) {
//			set.get(i); 	// index를 이용하여 내부 요소를 가져올 수 없다
		}
		
		// 순번을 사용하지 않고, 내부 요소 전체를 대상으로 하는 반복문을 쓰면 된다 (향상된 for문)
		for(Integer num : set) {	// set내부의 각 요소를 정수 num이라고 할때
			System.out.println(num); // 그 값을 출력
		}
		
//		Map : 정수형태의 순서 대신, 임의의 형태로 key를 만들어서 value를 관리한다
//		key와 value가 1:1 맵핑되어 저장되기 때문에 Map이라고 부른다
//		python의 dict와 유사하다
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("car", "자동차");
		System.out.println(map);
		
		for(String key : map.keySet()) {	// key의 묶음만 따로 가져와서 반복문
			Object value = map.get(key);
			System.out.println(key + " : " + value);
		} System.out.println();
		
		// key는 변수이름역할, value은 변수에 저장된 값역할
		// 서로 다른 객체를 하나로 묶어서 전달할 경우 유용하게 사용할 수 있다
		
	}
}
