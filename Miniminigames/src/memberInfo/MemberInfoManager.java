package memberInfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	public void save() {
		if(members.size()==0) {
			System.out.println("저장된 데이터가 없어 파일이 저장되지 않았습니다");
			return;
		}
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("members.ser"));
			out.writeObject(members);
			out.close();
			System.out.println("저장완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("저장과정에 오류가 발생했습니다. 다시 시도해 주세요");
			e.printStackTrace();
		}
		
	}
	
	//값 수정
	public void addInfo() {//회원가입
		System.out.println("회원가입을 시작합니다.");
		System.out.println("가입하는 분의 이름을 입력해 주세요: ");
		String name= SC.nextLine();
		String id="";
		do {
			if(id != "") System.out.println("중복된 아이디가 있습니다 다시 입력해 주세요");
			System.out.println("가입할 아이디를 입력해 주세요: ");
			id= SC.nextLine();
			if(isMember(id, name)) {
				System.out.println("이미 가입된 회원입니다. 로그인해주세요");
				return;
			}
		}while(searchId(id) != -1);

		String password=null;
		String passwordCheck="";
		do{
			if(password != null)System.out.println("비밀번호와 비밀번호 확인의 값이 다릅니다 다시 입력해 주세요");
			System.out.println("이용할 비밀번호를 입력해 주세요: ");
			password= SC.nextLine();
			System.out.println("비밀번호 확인을 위해 비밀번호를 한번더 입력해 주세요: ");
			passwordCheck = SC.nextLine();
		}while(!password.equals(passwordCheck));
		members.add(new MemberInfo(name, id, password));
		System.out.println("회원가입이 완료되었습니다. 로그인해주세요");
		return;
		
		
	}
	public void deleteInfo() {//회원탈퇴
		members.remove(membernum);
		System.out.println("회원탈퇴되셨습니다. 프로그램을 종료합니다.");
		save();
		System.exit(0);
	}
	private int searchId(String id) {//아이디의 인덱스 찾기
		int index= -1;
		
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getId().equals(id)) {
				index= i;
				break;
			}
		}
		
		
		return index;
	}


	private boolean isMember(String id, String name) {//가입여부 확인
		//중복아이디 찾기
		int tmpidx= this.searchId(id);
		if (tmpidx == -1) return false;
		
		if(members.get(tmpidx).getName().equals(name)) {
			//System.out.println("이미가입된 회원정보");
			return true;
		}
		
		return false;
	}
	public void updatePoint(int getPoint) {//얻은 양 기준, 잃었으면 음수표현
		if(members.get(membernum).getPoint()+getPoint <0) {
			System.out.println("포인트가 부족합니다");
			return;
		}
		int tmppoint= members.get(membernum).getPoint()+getPoint;
		members.get(membernum).setPoint(tmppoint);
	}
	
	public int updateScore() {
		int changedScore=0;
		return changedScore;
	}
	
	public void changeName( ) {
		System.out.println("바꾸실 이름을 써주세요.");
		String newname = SC.nextLine();
		members.get(membernum).setName(newname);
	}
	
	public void changePassword() {
		System.out.println("비밀번호 변경을 위해 기존 비밀번호를 입력해 주세요: ");
		String pwBefore= SC.nextLine();
		if(members.get(membernum).getPassword() == pwBefore) {
			String pwAfter= SC.nextLine();
			members.get(membernum).setPassword(pwAfter);
		}
	}
	
	
	//기능
	public void resetLife() {
		//정각마다 라이프 늘려주는기능 나중에 구현
	}
	
	
	public void login(String id, String password) {
		
		int tmpidx= searchId(id);
		if(tmpidx == -1) {
			System.out.println("해당 아이디로 가입된 회원정보가 없습니다. 초기화면으로 돌아갑니다.");
			return;
		}
		else if(members.get(tmpidx).getPassword() == password) {
			membernum= tmpidx;
			System.out.println("로그인에 성공했습니다.");
			return;
		}
		System.out.println("아이디와 비밀번호가 올바르지 않습니다. 초기화면으로 돌아갑니다.");
		return;
	}

	//멤버정보
	public void showMemInfo() {
		
		
		
	}

}
