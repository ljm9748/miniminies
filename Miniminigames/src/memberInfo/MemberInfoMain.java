package memberInfo;

public class MemberInfoMain {

	public static void main(String[] args) {

		MemberInfoManager manager = MemberInfoManager.getManager();
		manager.membernum=0;
		manager.useLife();
		manager.showAllInfo();

	}

}
