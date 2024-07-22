package string;

public class Ex1 {

	public static void main(String[] args) {

		// 리터럴 방식으로 문자열 객체 생성
		// 상수 풀 안에 같은 값이 있으면 재생성 하지 않고 공유해서 사용함
		String str1 = "test"; // 새로운 문자열 생성
		String str2 = "test"; // 상수풀에 이미 test 문자열이 있어서, 같은 객체를 사용함
		
		// new 방식으로 문자열 객체 생성
		// 새로운 인스턴스를 생성할 때마다 힙영역에 새롭게 생성됨
		String str3 = new String("test"); // 새로운 문자열 생성
		
		System.out.println(str1 == str2); // str1과 str2가 같은 객체를 공유해서 주소 값이 같음
		System.out.println(str1 == str3); // 새로 문자열이 생성됐으므로 주소값이 다름
		
	}
	
}
