package object;

public class Ex3 {

	public static void main(String[] args) {

		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1001, "둘리");
		
		//비교연산자로 비교
		if (student1 == student2) { //메모리 주소로 비교. (100번지 == 200번지)
			System.out.println("student1와 student2의 주소는 같습니다.");
		} else {
			System.out.println("student1와 student2의 주소는 다릅니다.");
		}
		
		//equals 메소드로 비교
		if (student1.equals(student2)) { // 학생의 학번으로 비교. (1001 == 1001)
			System.out.println("student1와 student2는 같은 학생입니다.");
		} else {
			System.out.println("student1와 student2는 다른 학생입니다.");
		}

	}

}

class Student {
	
	int id; // 학번
	String name; // 학생의 이름
	
	// 모든 멤버변수를 초기화하는 생성자 추가!
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	// Object의 equals 메소드 재정의해서 사용(다운캐스팅)
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(this.id == student.id) { //학번이 같으면 true반환
				return true;
			}
	
		}
	
		return false;
		
	}

}
