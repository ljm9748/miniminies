package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersonInfo implements Serializable{
	
	String name;
	transient String secretInfo; // transient 또는 static이 붙어 있을 경우에는 직렬화가 되지 않는다.
	int age;
	transient int secretNum;
	
	public PersonInfo(String name, String secretInfo, int age, int secretNum) {		
		this.name = name;
		this.secretInfo = secretInfo;
		this.age = age;
		this.secretNum = secretNum;
	}
	
	public void showInfo() {
		System.out.println("name >> " + name);
		System.out.println("secretinfo >> " + secretInfo);
		System.out.println("age >> " + age);
		System.out.println("secret Number >> " + secretNum);
		
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// 인스턴스 저장 스트림 생성
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Personinfo.ser"));
		
		// 값 출력
		PersonInfo info = new PersonInfo("손흥민", "010-9999-8888", 30, 20);
		info.showInfo();
		
		
		
		// 인스턴스 저장
		out.writeObject(info);
		out.close();
		
		// 인스턴스 정보 복원을 위한 스트림 생성
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Personinfo.ser"));
		
		// 복원
		PersonInfo reInfo = (PersonInfo)in.readObject();
		
		// 복원된 인스턴스의 정보 출력
		reInfo.showInfo();
		
	}
	
	

}
