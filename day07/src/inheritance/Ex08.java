package inheritance;

class Pos2D {       // 상위 클래스
    int x;
    int y;

    Pos2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    void show() {
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
        System.out.println();
    }
}

class Pos3D extends Pos2D {       // 하위 클래스
    int z;
    // 1) 서브 클래스는 슈퍼 클래스의 생성자를 호출할 수 있어야 한다
    Pos3D(int x, int y, int z) {
        super(x, y);
        // this.x = x;
        // this.y = y;
        this.z = z;
    }
    void show() {
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
        System.out.println("Z : " + z);
    }
}

public class Ex08 {
    public static void main(String[] args) {
        Pos2D pb1 = new Pos2D(3, 7);
        pb1.show();

        Pos3D ob2 = new Pos3D(2, 5, 4);
        ob2.show();
    }
}
