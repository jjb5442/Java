package function;

public class Quiz01 {
    static int summary(int a, int b) {
        int max, min;
        if (a < b) {
            max = b; min = a;
        }
        else {
            max = a; min = b;
        }
        return (max - min + 1) * (min + max) / 2;
    }
    static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
    static String getReadableSize(long a) {
        String tmpString = null;
        double tmpDouble = a;
        int t = 0;
        
        while (true) {
            tmpDouble /= 1024;
            t++;
            if (tmpDouble < 1024) break;
        }
        tmpString = String.format("%.2f", tmpDouble);
        if (t == 0) tmpString += "byte";
        if (t == 1) tmpString += "KB";
        if (t == 2) tmpString += "MB";
        if (t == 3) tmpString += "GB";
        if (t == 4) tmpString += "TB";

        return tmpString;
    }
    
    public static void main(String[] args) {
        // 1) 두 정수를 전달받아서, 두 정수 사이의 합계를 반환하는 함수
        int a = summary(1, 10);
        System.out.println(a);

        // 2) 세 정수를 전달받아서, 세 정수의 평균값을 실수형태로 반환하는 함수
        double b = average(100, 99, 87);
        System.out.println(b);

        // 3) 파일의 용량을 byte단위로 전달받아서, 문자열형식으로 반환하는 함수
        // 1024byte = 1KB, 1024KB = 1MB, 1024MB = 1GB, 1024GB = 1TB
        String c = getReadableSize(14519929993994L);
        
        System.out.println(c); // 1.39MB
    }
    
}
