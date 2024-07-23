package wrapper;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		String sum1 = scanner.nextLine(); // 첫번째 숫자 입력
		String sum2 = scanner.nextLine(); // 두번째 숫자 입력
		System.out.println("문자열 : " + sum1 + sum2); //105
		
		int sum3 = Integer.parseInt(sum2) + Integer.parseInt(sum1);
		System.out.println("형변환 : " + sum3);
		
		
		
	}

}
