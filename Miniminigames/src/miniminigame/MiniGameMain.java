package miniminigame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import memberInfo.MemberInfoManager;

import java.io.IOException;

public class MiniGameMain implements Util, Menu {

	public static void main(String[] args) throws IOException {
		
		
		
		MemberInfoManager member = MemberInfoManager.getManager();
		
		MenuManager gmanager =  new MenuManager();
		
		String MINI[] = {
				"■■   ■■  ■■■  ■■   ■  ■■■  ■■■■■    ■     ■■   ■■  ■■■■■  ",
				"■ ■ ■ ■   ■   ■ ■  ■   ■   ■       ■  ■   ■ ■ ■ ■  ■      ",
				"■  ■  ■   ■   ■  ■ ■   ■   ■  ■■  ■■■■■■  ■  ■  ■  ■■■■■  ",
				"■  ■  ■   ■   ■    ■   ■   ■   ■  ■    ■  ■  ■  ■  ■      ",
				"■     ■  ■■■  ■    ■  ■■■  ■■■■■  ■    ■  ■     ■  ■■■■■  ",
				" "
	    };
		
		for (int i = 0; i < MINI.length; i++) {
		      // 메세지를 출력
		      System.out.println(MINI[i]);
		} 
		
		//member.addInfo();
		//member.save();
		
		
		//member.login(null, null);

		gmanager.run();



	}

}