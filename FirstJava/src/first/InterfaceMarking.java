package first;

public class InterfaceMarking {

	public static void main(String[] args) {
		
		PointOne pos1 = new PointOne(1, 1);
		PointTwo pos2 = new PointTwo(2, 2);
		PointOne pos3 = new PointOne(3, 3);
		PointTwo pos4 = new PointTwo(4, 4);
		
		String test = "test";
		
		ClassPrinter.print(pos1); // static이라 이런 형식으로 출력
		ClassPrinter.print(pos2);
		ClassPrinter.print(pos3);
		ClassPrinter.print(pos4);
		ClassPrinter.print(test);
		

	}

}

interface UpperCasePrintable{ // 마킹의 효과 
	
}


class PointOne implements UpperCasePrintable{
	private int xPos;
	private int yPos;
	
	PointOne(int x, int y){
		xPos=x;
		yPos=y;
	}
	
	@Override
	public String toString() {
		return "[x pos: " + xPos + ", y pos:" + yPos + "]";
		
	}
}

class PointTwo{
	private int xPos, yPos;
	
	PointTwo(int x, int y){
		xPos=x;
		yPos=y;
	}

	@Override
	public String toString() {
		return "[x Pos=" + xPos + ", y Pos=" + yPos + "]";
	}
}

class ClassPrinter{
	public static void print(Object obj) {
		String str = obj.toString();
		// UpperCasePrintable => 형변환 가능 여부 확인
		if(obj instanceof UpperCasePrintable) {
			// true => 대문자로 변경해서 반환
			str = str.toUpperCase();
		}
		System.out.println("str >> " + str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}