package memberInfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class MemberInfoManager implements Util{
	
	int membernum;
	
	
	List<MemberInfo> members;
	private MemberInfoManager() {
		members = new ArrayList<MemberInfo>();	//리스트 형식의 members초기화
		membernum=-1;
		load();								  	//파일에서 인스턴스 로드
	}

	//인스턴스 생성
	private static MemberInfoManager manager = new MemberInfoManager();
	//getter
	public static MemberInfoManager getManager() {
		return manager;
	}
	

	//메서드
	//로드, 저장
	private void load() {//파일에서 인스턴스 로드
		File file= new File("members.ser");
		//파일이 없는 경우
		if(!file.exists()) {
			System.out.println("저장된 파일을 찾을 수 없어 새로 생성후 로드됩니다.");
			return;
		}
		
		//있는경우 members에 불러옴
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("members.ser"));
			members= (List<MemberInfo>) in.readObject();
			System.out.println("데이터 로드 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("데이터를 로드하는 과정에 오류가 발생했습니다.");
			e.printStackTrace();
		}
		
	}
	public void save() {}
	
	//값 수정
	public void addInfo() {//회원가입
		System.out.println("회원가입을 시작합니다.");
		System.out.println("가입하는 분의 이름을 입력해 주세요: ");
		String name= SC.nextLine();
		System.out.println("가입할 아이디를 입력해 주세요: ");
		String id= SC.nextLine();
		String password=null;
		String passwordCheck="";
		do{
			if(password != null)System.out.println("비밀번호와 비밀번호 확인의 값이 다릅니다 다시 입력해 주세요");
			System.out.println("이용할 비밀번호를 입력해 주세요: ");
			password= SC.nextLine();
			System.out.println("비밀번호 확인을 위해 비밀번호를 한번더 입력해 주세요: ");
			passwordCheck = SC.nextLine();
		}while(password.equals(passwordCheck));
		
		
	}
	public void deleteInfo() {}
	private int searchIndex() {
		
		return 0;
	}
	public void updatePoint() {}
	public int updateScore() {
		int changedScore=0;
		return changedScore;
	}
	public void changeName() {}
	public void changePassword() {}
	
	
	//기능
	public void resetLife() {}

}
