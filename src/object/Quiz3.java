package object;

public class Quiz3 {

	public static void main(String[] args) {

		// 주소값은 dog에 , 내용은 "인스턴스" 안에 있는것임
		Dog dog = new Dog("멍멍이", "진돗개");
		System.out.println(dog); // dog.toString()과 같음

	}

}

class Dog {
	String name;
	String type;
	
	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return type + " " +  name;
	}
	
}

