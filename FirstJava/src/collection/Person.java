package collection;
//20.10.23
import java.util.Iterator;
import java.util.TreeSet;

public class Person implements Comparable<Person>{

	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age; 		
	}
	
	// toString 오버라이딩
	public String toString()
	{
		return name + "("+age+")";
	}
	@Override
	public int compareTo(Person o) {
//		if(age>o.age) {
//			return 1;	// 양수 반환 >> 전달 받은 객체의 값이 작을 경우 
//		} else if(age<o.age) {
//			return -1;	// 음수 반환 >> 전달받은 객체의 값이 클 경우			
//		} else {
//			return 0;
//		}
		
		return age-o.age;	// 오름차순으로 만들어줌.
		//return o.age-age;	// 내림차순으로 만들어줌.
	}
	
	public static void main(String[] args) {
		
		TreeSet<Person> tSet = new TreeSet<Person>();
		
		tSet.add(new Person("son", 28));
		tSet.add(new Person("Park", 40));
		tSet.add(new Person("Lee", 20));
		
		Iterator<Person> itr = tSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	

}




