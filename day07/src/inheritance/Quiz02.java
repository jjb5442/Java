package inheritance;

class Quiz {
    int n1;
    int n2;
    Quiz(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getAnswer() {
        return 0;
    }
}
// Quiz 클래스를 상속받아서 새로운 클래스 2개를 작성하고 테스트해보세요
// 1) 두 정수의 합을 반환하는 함수를 가지는 클래스, getAnswer() 오버라이딩
class SumNum extends Quiz {
    SumNum(int n1, int n2) {
        super(n1, n2);
    }
    
    @Override   // 이 함수는 상속받는 내용을 변경한 함수입니다
    public int getAnswer() {
        return n1 + n2;
    }
}

// 2) 두 정수 사이의 합을 반환하는 함수를 가지는 클래스
class SumBetween extends Quiz {
    SumBetween(int n1, int n2) {
        super(n1, n2);
    }

    @Override
    public int getAnswer() {
        return (n2 - n1 + 1) * (n1 + n2) / 2;
    }
}


class Quiz02 {
    public static void main(String[] args) {
        SumNum ob1 = new SumNum(1, 10);
        int n1 = ob1.getAnswer();
        
        SumBetween ob2 = new SumBetween(1, 10);
        int n2 = ob2.getAnswer();

        System.out.println(n1);
        System.out.println(n2);
    }
}

