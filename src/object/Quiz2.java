package object;

public class Quiz2 {

	public static void main(String[] args) {

		// Object는 모든 클래스의 부모이기때문에 형변환 가능
		// 하지만 Object 타입변수로는 학생의 정보를 사용할 수 없음
		Object obj = new Student(11, "심태훈");
		
		// 다운캐스팅 진행
		if(obj instanceof Student) { // 타입 체크
			Student stu = (Student) obj; // 원래 타입으로 변경
			System.out.println(stu.id);
			System.out.println(stu.name);
			
			
		}

	}

}
