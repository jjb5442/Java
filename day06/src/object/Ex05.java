package object;

class Test {
    // 생성자를 작성하지 않아도, 생성자를 호출할 수 있다
    // 생성자 : 클래스의 이름과 동일한 이름의 함수
    // 객체를 생성하고, 생성 직후 초기 작동을 정의할 수 있는 함수
    // 생성자는 반환형이 없다
    // 생성자도 함수이므로, 함수 오버로딩(중복정의)이 가능하다
    // 클래스에 생성자를 작성하지 않으면 컴파일 때 
    // JVM이 기본 생성자를 자동으로 만들어준다
    // 직접 생성자를 작성하면, 더 이상 자동으로 기본생성자를 만들어주지 않는다

    Test() {
        // 1) 클래스에 정의된 내용을 지반으로 객체를 생성한다
        // 2) 객체 생성이 끝난 후, 객체 초기 설정을 수행하는 역할을 한다
    }
}

public class Ex05 {
    public static void main(String[] args) {
        Test ob1 = new Test();        // 객체 생성
        System.out.println(ob1);    // 생성된 객체를 곧바로 출력
    }
}
