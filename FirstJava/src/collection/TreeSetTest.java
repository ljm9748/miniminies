package collection;
//20.10.23
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		// TreeSet >> 트리구조로 저장하는 자료 구조, 2진 트리
		// TreeSet 인스턴스를 생성
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		
		tSet.add(1);
		tSet.add(5);
		tSet.add(2);
		tSet.add(4);
		tSet.add(3);
		tSet.add(2);	// 값이 같기 때문에 5개만 출력이 됨.
		
		System.out.println("TreeSet 요소의 개수 >> " + tSet.size());
		Iterator<Integer> itr = tSet.iterator();
		
		while(itr.hasNext() ) {
			System.out.println(itr.next());
		}
 		
		
		
		
		
	}
}
