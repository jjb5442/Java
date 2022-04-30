package inheritance;

// 자바는 클래스의 상속을 사용할 경우, 단일 상혹만 가능하다
// 즉 어떤 클래스의 슈퍼클래스는 오로지 하나만 있다는 이야기다
// 슈퍼클래스가 만약 2개 이상이 되면, 어떤 클래스의 내용을 상속받았는지, 재정의하는지 혼란이 생길 수 있다

// 어떤 클래스의 슈퍼클래스가 지정되지 않았다면 자동으로 Object 클래스를 상속받게 되어 있다
// Object는 자바의 모든 클래스의 최상위 클래스이다

class AA /* extends Object */ {
    // Nothing

    // 상속받은 메서드를 재정의 한다면
    @Override
    public String toString() {      // 객체를 문자열형태로 변환하는 함수 (출력문에 객체를 넣으면 자동으로 호출)
        return "AA Class redefine toString() Method";
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1234;
    }
}

public class Ex10 {
    public static void main(String[] args) {
        AA ob = new AA();
        System.out.println(ob);     // Same as ob.toString()
        System.out.println(ob.toString());
        System.out.println(ob.getClass().getSimpleName());
        System.out.println(ob.hashCode());
    }
}
