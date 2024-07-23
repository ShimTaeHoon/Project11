package wrapper;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		// 리스트는 기초타입을 사용할 수 없기 때문에 'Boolean'과 같은 래퍼클래스를 사용해야함
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true); // new Boolean(true)로 변환됨. (오토박싱)
		list.add(true);
		list.add(false);
		
		// booleanValue를 통해 Boolean타입의 get이 boolean으로 변환되기 때문에
		// 타입 미스매치가없음
		boolean b = list.get(0); // list.get(0).booleanValue()으로 변환됨. (언박싱)

	}

}
