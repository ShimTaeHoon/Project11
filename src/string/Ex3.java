package string;

public class Ex3 {

	public static void main(String[] args) {

		// 문자열을 수정하면 인스턴스의 주소가 달라짐..
		String str = "java";
		System.out.println("str의 주소: " + System.identityHashCode(str));
		str = str + " and";
		str = str + " android";
		// 주소가 변경 됐다 = 객체가 새로 생성 됐다
		System.out.println("값 변경 후 str의 주소: " + System.identityHashCode(str));
		System.out.println(str);
		System.out.println();
		
		// String 클래스는 값을 변경하면 문자열이 계속 생성되서.. 메모리가 낭비됨
		// StringBuilder클래스는 조금 더 유연하기 때문에
		// 문자열이 자주 변경된다면 StringBuilder를 사용할 것
		StringBuilder buffer = new StringBuilder("java");
		System.out.println("buffer의 주소: " + System.identityHashCode(buffer));
		// 내용 변경하고 싶을때 .append 메소드
		buffer.append(" and");
		buffer.append(" android");
		System.out.println("값 변경 후 buffer의 주소: " + System.identityHashCode(buffer));
		System.out.println(buffer.toString());

	}

}
