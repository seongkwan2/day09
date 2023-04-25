package set_get;

import java.util.Scanner;

/*
로그인 프로그램 만들어 주세요
LoginClass
	private id, pwd
	각 set, getter생성 및 연산하는 기능
MainClass
	보여지는 기능을 만들자
	1.로그인
	2.회원가입
	3.종료
*/
public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int menu = 0;

        LoginClass lo = new LoginClass();
        
        
		while (menu != 3) {// 3입력시 false로 변함
            // 초기화면
            System.out.println("\n=== 로그인 프로그램 ===");
            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");
            System.out.println("3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            menu = sc.nextInt(); // 메뉴 선택

            switch (menu) {
                case 1:
                    lo.login(); // 로그인 메서드 호출
                    break;
                case 2:
                    lo.signup(); // 회원가입 메서드 호출
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다.");
                    break;
            }
        }
    }
}













