package string;

public class Quiz1 {

	public static void main(String[] args) {

		String str = "a:b:c:d";
		String str2 = str.replace(":", "#");
		System.out.println(str2); // a#b#c#d 출력
	
		String dooly = "안녕하세요 저는 둘리입니다";
		System.out.println(dooly.indexOf("둘")); // "둘리"의 인덱스를 찾기
		System.out.println(dooly.substring(9,11)); // 시작위치, 마지막 전 (9번~10번)
		
	}

}
