package loop;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		String fileName = "C:\\windows\\system32\\drivers\\etc\\hosts";
		File f = new File(fileName);
		Scanner sc = new Scanner(f);
		// 파일 이름을 지정하고, 팡리 객체를 생성하여, 파일을 읽어내는 Scanner를 생성
		
		while (sc.hasNextLine()) {
			// sc에 아직 처리하지 않은 다음 줄이 있다면
			String data = sc.nextLine();	// 다음 줄을 가져와서 출력
			System.out.println(data);
		}
		sc.close();
	}
}
