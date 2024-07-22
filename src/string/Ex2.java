package string;

public class Ex2 {

	public static void main(String[] args) {
		
		String str = "test";
		System.out.println("str 문자열 값: " + str + ", 주소: " + str.hashCode());
		
		// String클래스의 final byte[]변수에 final이 선언 되어있어서 값을 못바꿈
		// str의 값이 변경되면 수정이 아니라 재할당이라 주소가 변경되는 것
		str = "aaa";
		System.out.println("str 문자열 값: " + str + ", 주소: " + str.hashCode());
		// 주소가 변경됨..

	}

}
