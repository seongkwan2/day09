package test_;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		MemberManagement memberManagement = new MemberManagement();

		while (true) {
			System.out.println("===== 회원관리 프로그램 =====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			System.out.print("메뉴를 선택하세요: ");

			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				memberManagement.signUp();
				break;
			case 2:
				memberManagement.logIn();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 메뉴입니다. 다시 선택해주세요.");
			}
		}
	}
}