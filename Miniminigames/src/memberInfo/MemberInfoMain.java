package memberInfo;

public class MemberInfoMain {

	public static void main(String[] args) {

		MemberInfoManager manager = MemberInfoManager.getManager();
		manager.addInfo();
		manager.save();

	}

}
