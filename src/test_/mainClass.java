package test_;

import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {

		loginClass lo = new loginClass();
		Scanner scan = new Scanner(System.in);
		int menu = 0;


		while(menu != 5) {
			System.out.println("===메 뉴===");
			System.out.println("1.로그인\n2.회원가입\n3.내 정보 확인"
					+ "\n4.비밀번호 변경\n5.종료\n번호입력>>>");
			menu = scan.nextInt();

			switch(menu) {
				case 1:
					lo.login();
					break;
				case 2:
					lo.register();
					break;
				case 3:
					lo.myInfo();
					break;
				case 4:
					lo.edit();
					break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    break;
				default: System.out.println("잘 못 입력 하셨습니다.");

			}
		}
	}
}
