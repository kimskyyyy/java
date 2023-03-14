package dbConcept03.run;

import dbConcept03.view.MemberView;

public class Main {
	/*
	 * 시작용 클래스 : dbConcept03.run.Main.java
	 */
	public static void main(String[] args) {
		MemberView mv = new MemberView(); // view 클래스를 객체로 생성 후 mainMenu 호출
		mv.mainMenu();
	}
}
