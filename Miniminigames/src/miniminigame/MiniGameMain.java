package miniminigame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Timer;

import memberInfo.MemberInfoManager;
import memberInfo.TimerForLife;

import java.io.IOException;

public class MiniGameMain implements Util, Menu {

	public static void main(String[] args) throws IOException {
		
		
		MenuManager gmanager =  new MenuManager();
		MemberInfoManager member = MemberInfoManager.getManager();
		TimerForLife tfl = TimerForLife.getTimer();
		
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
		member.showAllInfo();
		// 로그인 or 회원가입
		gmanager.login();
		tfl.startAddLife();

	      
		gmanager.run();

	}
}