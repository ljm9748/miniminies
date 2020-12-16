package collection;
//20.10.23

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// List<E> >> 저장 순서가 유지된다 -> 반복문을 이용할 수 있다. / 중복 저장이 허용된다. -> 
		
		
		// 인스턴스 저장을 목적으로 하는 클래스
		// List 인스턴스 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		// ArrayList는 import 필요
		
		// 데이터 저장: 참조값을 저장
		// add(<T>)- 메소드 
		list.add(new Integer(11));
		list.add(new Integer(22));
		list.add(new Integer(33));
		list.add(55);	// Auto Boxing
		list.add(44);	// 저장의 순서를 유지함을 보여주기 위해 55-44 순으로 저장
		
		// List의 요소 참조 
		// <T>get()
		System.out.println("list의 첫번째 요소의 값 >> " + list.get(0));
		
		// List 요소의 개수 -> size()-메소드 -> 0이상의 숫자를 반환
		System.out.println("list의 요소 개수 >> " + list.size());
		
		// 반복문을 이용한 모든 요소 참조
		for(int i=0; i<list.size(); i++) {
			System.out.println("list["+i+"] >> "+list.get(i));			
		}
		
		System.out.println("-----------");
		for(Integer i : list) {
			System.out.println("i >> " + i);
		}
		
		System.out.println("-----------");
		// list 요소의 삭제 -> remove(index값)
		// 첫번째 요소를 삭제
		list.remove(0);
		for(int i: list) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
