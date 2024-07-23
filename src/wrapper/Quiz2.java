package wrapper;

public class Quiz2 {

	public static void main(String[] args) {
		// 정수 10을 문자열 변수에 저장하세요.
		// 1. 래퍼클래스의 toString 사용하기
		String str1 = Integer.toString(10);
		String str2 = Double.toString(1.123);
		String str3 = Character.toString('c');
		String str4 = Boolean.toString(true);
		
		// 2. String 클래스의 valueOf 사용하기
		// valueOf 오버로딩
		String str5 = String.valueOf(10);
		String str6 = String.valueOf(1.123);
		String str7 = String.valueOf('c');
		String str8 = String.valueOf(true);
		
		// 정수 10을 문자열 변수에 저장하세요.
		Integer iNum = Integer.valueOf(10);
		String str = iNum.toString();
		System.out.println(str);
		
		// 실수 1.123을 문자열 변수에 저장하세요.
		Float iFloat = Float.valueOf(1.123f);
		String strr2 = iFloat.toString();
		System.out.println(strr2);
		
		// 문자 c를 문자열 변수에 저장하세요.
		String strr3 = "c";
		
		// boolean타입의 true값을 문자열 변수에 저장하세요.
		Boolean iBool = Boolean.valueOf(true);
		String strr4 = iBool.toString();
		System.out.println(strr4);

	}

}
