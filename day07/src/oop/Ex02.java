package oop;

// 접근제한자를 적용한 객체의 값 설정과 참조

class Human {
    private String name;    // 클래스 외부에서 임의로 접근하거나 값을 변경할 수 없게 된다
    private int age;

    public void setName(String name) { // 지정된 기능을 통해서 필드의 값을 변경하도록 설정해둔다
        this.name = name;
    }
    public void setAge(int age) {      // 매개변수를 하나 받아서, 멤버필드에 대입하는 함수 -> setter
        this.age = age;
    }
    public String getName() {          // 지정된 기능을 통해서 필드의 값을 참조하도록 설정해둔다
        return name;
    }
    public int getAge() {               // 매개변수 없이 멤버필드의 값을 반환하는 함수 -> getter
        return age;
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Human ob = new Human();
        // ob.name = "이지은";
        // ob.age = 30;
        // System.out.printf("%s는 %d살입니다\n", ob.name, ob.age);
        
        ob.setName("A");
        ob.setAge(30);
        
        System.out.printf("%s는 %d살입니다\n", ob.getName(), ob.getAge());
    }
}
