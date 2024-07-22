package string;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		// 1. 하드코딩
		System.out.print(str.charAt(4));
		System.out.print(str.charAt(3));
		System.out.print(str.charAt(2));
		System.out.print(str.charAt(1));
		System.out.print(str.charAt(0));
		System.out.println();
		
		// 2. 문자열에서 뒤에서부터 한 글자씩 출력
		int i = str.length() -1;
		while (i >= 0) {
			System.out.print(str.charAt(i));
			i--;
		}
	}

}
