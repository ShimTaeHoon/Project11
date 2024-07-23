package wrapper;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {

		// 문자형 래퍼클래스 리스트 생성
		ArrayList<Character> list = new ArrayList<Character>();

		// list에 문자 'a','b','c','d'를 삽입
		list.add('a'); // -> list.add(new Character('a'))으로 변환 (오토박싱)
		list.add('b');
		list.add('c');
		list.add('d');

		// 리스트 안에 저장된 문자를 모두 출력
		for (int i = 0; i < list.size(); i++) {
			char ch = list.get(i); // list.get(i).charValue()으로 변환 (언박싱)
			System.out.println(ch);
		}

	}

}
