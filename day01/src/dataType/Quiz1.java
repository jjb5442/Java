package dataType;

public class Quiz1 {
	// 문제1) 버스 한 구간 당 걸리는 평균 시간이 3분이라고 가정한다
	// A라는 사람은 14구간을 이동했고
	// B라는 사람은 22구간을 이동했다
	// 각각 걸리는 예상시간을 화면에 출력하세요
	// 이동시간을 시, 분 단위로 나누어서 출력해보세요
	public static void main(String[] args) {
		int timeA, timeB;
		int moveA = 14, moveB = 22;
		int term = 3;
		timeA = moveA * term;
		timeB = moveB * term;
		System.out.println("A의 이동시간 : " + timeA / 60 + "시간 " + timeA % 60 + "분");
		System.out.println();
		System.out.println("A의 이동시간 : " + timeB / 60 + "시간 " + timeB % 60 + "분");
	}
	
}
