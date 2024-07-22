package string;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		// 1,3 남자 > 성별이 남자입니다.
		// 2,4 여자 > 성별이 여자입니다.
		String pin = "881120-2068234";
		String pin2 = "881120-1068234";
		
		char gender = pin.charAt(7);
		
		if (gender == '1' || gender == '3') {
			System.out.println("성별은 남자입니다.");
		} else if (gender == '2' || gender == '4'){
			System.out.println("성별은 여자입니다");
		} else {
			System.out.println("잘못된 값입니다");
		}
	
	}

}
