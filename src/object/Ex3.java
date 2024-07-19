package object;

public class Ex3 {

	public static void main(String[] args) {

		

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
