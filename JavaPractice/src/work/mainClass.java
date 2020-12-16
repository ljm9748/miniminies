package work;

public class mainClass {

	public static void main(String[] args) {
		//변수의 선언
		String name;
		int age;
		boolean woman;
		String phone;
		double height;
		String address;
		
		System.out.println("=========================================================");
		System.out.println("\\\tname\tage\t성별\tphone\t\theight\taddress\t\\");
		System.out.println("=========================================================");
		
		//변수의 대입
		name = "홍길동";
		age = 20;
		woman = false;
		phone = "010-1234-5678";
		height = 175.12;
		address = "경기도";
		
		
		//출력
		System.out.println("\\\t"+name+"\t"+age+"\t"+woman+"\t"+phone+"\t"+height+"\t" +address+"\t");
		
		//변수의 대입
		name = "일지매";
		age = 11;
		woman = true;
		phone = "010-1234-5678";
		height = 180.12;
		address = "서울";
		
		//출력
		System.out.println("\\\t"+name+"\t"+age+"\t"+woman+"\t"+phone+"\t"+height+"\t" +address+"\t");

	}

}
