package string;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
//1
//		// 무한루프
//		while(true) {
//			System.out.println("계속 실행됩니다..");
//		}
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {

			String str = scanner.nextLine();

			if (str.equals("END") || str.equals("end")) {
				break;
			}
		
			// 문자열 소문자 변환시
			// 대문자로 변환시 대문자를 비교대상자로 두고하면 됨
			if (str.toLowerCase().equals("end")) {
				break;
			}
			
			// 대소문자 상관없음
			if (str.equalsIgnoreCase("end")) {
				break;
			}
		}
	}

}
