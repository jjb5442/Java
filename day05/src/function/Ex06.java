package function;

public class Ex06 {
    static int add(int n1, int n2) {
        return n1 + n2;
    }
    static int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    public static void main(String[] args) {
        // 함수 오버로딩 (메서드 오버로딩)
        // 자바에서는 같은 함수 이름으로 여러개의 정의를 만들 수 있다
        // 구분하는 기준은 매개변수의 자료형 및 매개변수의 개수이다
        int num1 = add(10, 20);
        int num2 = add(10, 20, 30);
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);

        int[] arr = {1, 2};
        System.out.println(arr);    // object

        char[] arr2 = { 'H', 'E' };
        System.out.println(arr2);   // char[]

        // 하나의 함수가 여러 유형에 대해서 대응이 가능하도록 만들어진 기능
        // 오버로딩을 준비하는 입장에서는 함수를 여러개 작성해야 하므로 다소 번거롭다
        // 함수를 호출하여 실행하는 입장에서는 다양한 형태의 값을 전달해도 실행이 잘 된다
    }
    
}
