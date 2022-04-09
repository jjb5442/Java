package dataType;

// 자바 코드 작성 기본 규칙
// 1) 클래스의 이름은 반드시 첫 글자를 대문자로 작성한다
// 2) 클래스를 제외한 프로젝트, 패키지, 변수, 함수의 이름은 소문자로 시작한다

public class Ex01 {
	public static void main(String[] args) {
		// primitive type ( 기본 자료형, 원시 자료형 )
		// not class type, lower
		
		boolean bo;	// 논리값		true / false	1byte
		byte by;	// 정수		-128 ~ 127		1byte
		short sh;	// 정수		-32768 ~ 32767	2byte
		char ch;	// 정수		0 ~ 65535		2byte
		int num;	// 정수		-21억 ~ 21억		4byte
		long ln;	// 정수		+-922해			8byte
		float fl;	// 실수						4byte
		double db;	// 실수						4byte
		
		by = (byte)200;
		System.out.println(by);
		
	}
}
