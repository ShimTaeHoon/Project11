package object;

public class Ex4 {

	public static void main(String[] args) {

		Book book = new Book(200, "개미");
		// 참조변수는 주소값을 가리키는데 아래에서 toString을 재정의 해서
		// 주소값이 아닌 Book클래스의 멤버변수를 출력
		System.out.println(book.toString());
		System.out.println(book); // book.toString()과 같음
		
		// 해시코드를 가지고 주소값을 출력
		// 실제로는 참조변수 주소값과 같은 주소값이나 표현방식의 차이임
		Book book2 = book;
		System.out.println(book.hashCode());
		System.out.println(book2.hashCode()); // 같은 인스턴스를 바라보기 때문에 주소가 같음
		
	}

}

// 도서 클래스
class Book {
	
	int bookNumber; // 번호
	String bookTitle; // 제목
	
	// 모든 멤버변수를 초기화 하는 생성자~
	public Book(int bookNumber, String bookTitle) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	// 재정의 전 toString()의 원형은
	// 인스턴스의 주소값을 반환하도록 설계되어 있음
	// 클래스 멤버변수를 사용해서 자동으로 문자열이 생성됨
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}
	
}