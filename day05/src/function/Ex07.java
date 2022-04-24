package function;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws IOException {
        String str = "Hello\nWorld\n";        
        File f = new File("C:\\windows\\system32\\drivers\\etc\\hosts");
        InputStream is = System.in;

        // 1) 문자열
        // 2) 파일
        // 3) 시스템 표준 입력 (데이터를 입력받는 통로)

        Scanner sc1 = new Scanner(str);     // 문자열을 읽어내는 Scanner
        Scanner sc2 = new Scanner(f);       // 파일을 읽어내는 Scanner
        Scanner sc3 = new Scanner(is);      // 키보드 입력을 읽어내는 Scanner

        String data1 = sc1.nextLine();
        String data2 = sc2.nextLine();
        String data3 = sc3.nextLine();

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

        sc1.close();
        sc2.close();
        sc3.close();
        
    }
    
}
