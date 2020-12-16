package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Fist");
		list.add("Second");
		list.add("Third");
		list.add("Forth");
		
		// Iterator<E> 인스턴스 생성 >> iterator() 메소드를 호출 >> Iterator<E> 반환 
		System.out.println("요소 출력");
		
		// String타입의 iterator를 반환
		Iterator<String> itr = list.iterator();
		
		// hasNest(), next(), remove()
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			
			// compareTo -> 논리갑이 나와야함?
			if(str.compareTo("Third")==0) {
				itr.remove();	// 원본(list)를 삭제
			}
		}
		
		System.out.println("요소 삭제 후 리스트 출력 ");
		
		itr = list.iterator();	// 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
