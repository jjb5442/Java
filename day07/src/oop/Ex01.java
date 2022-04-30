package oop;

class Test1 {
    private int pri = 1;    // private : 외부로부터의 접근을 허용하지 않는다
    int pac = 2;            // package : 같은 패키지 폴더 내부에서의 접근은 허용한다 ( 별도로 작성하지 않음 )
    protected int pro = 3;  // protected : 같은 패키지 폴더 or 상속관계에 있는 클래스로부터의 접근을 허용
    public int pub = 4;     // public : 모든 외부로부터의 접근을 허용

    void show() {
        System.out.println("pri : " + pri);
        System.out.println("pac : " + pac);
        System.out.println("pro : " + pro);
        System.out.println("pub : " + pub);
        System.out.println();
    }
}

public class Ex01 {
    // 접근 제한자 : 클래스의 구성요소에게 접근이 발생할때 어느정도 범위까지 허용할 것인가 결정하는 키워드
    public static void main(String[] args) {
        Test1 ob = new Test1();     // 객체를 생성하고 초기값이 지정되어 있지만
        // ob.pri = 5;                 // Test1 클래스 외부에서 임의로 값을 바꾸어 두고
        ob.show();                  // 출력하면 결과가 달라지게 된다

        // The field Test1.pri is not visible
        // 외부에서 접근할 수 없게 설정했기 때문에, pri라는 필드가 있는지 없는지 판단할 수 없는 상태가 된다
        // 따라서 변수에 값을 대입할 수 없고, 값의 변경을 막을 수 있다

        // 일반적으로, 멤버 필드는 private으로 적용하고, 멤버 메서드는 public으로 적용한다
        // 속성(필드)의 직접적인 참조나 변경은 막아두고
        // 지정된 기능(메서드)을 통해서만 참조하거나 변경할 수 있도록 하기 위해서
        // 만약 값의 변경을 원치 않는다면, 메서드를 제한하거나 만들지 않을 수 있다
    }
}
