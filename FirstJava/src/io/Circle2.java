package io;

import java.io.Serializable;

public class Circle2 implements Serializable{
	// implements Serializable:직렬화의 대상이다, 인스턴스 저장이 가능하다.
	// 직렬화를 하기 위해서는 반드시 implements Serializable 구현해주어야 한다.
	
	// transient: 직렬화 대상에서 제외
	Point p;
	double rad;
	
	// 생성자
	public Circle2(int xPos, int yPos, double rad) {
		p = new Point(xPos, yPos);
		this.rad = rad;
	}
	
	// 메소드
	public void showCircleInfo() {
		System.out.printf("[%d,%d] \n", p.x, p.y);
		System.out.println("rad : " + rad);
	}
	
	
	

}
