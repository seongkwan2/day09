package test_;
import java.util.HashMap;
import java.util.Scanner;

public class MemberManagement {
	private HashMap<String, String> memberMap;

	public MemberManagement() {
		memberMap = new HashMap<String, String>();
	}

	public void signUp() { //회원가입
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하세요: ");
		String id = scan.nextLine();

		if (memberMap.containsKey(id)) { //같은 키가 존재
			System.out.println("이미 존재하는 아이디입니다.");
			return;//강제종료 break; 개념
		}

		System.out.print("비밀번호를 입력하세요: ");
		String password = scan.nextLine();

		memberMap.put(id, password);
		System.out.println("회원가입이 완료되었습니다.");
	}

	public void logIn() {	//로그인
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하세요: ");
		String id = scan.nextLine();

		if (!memberMap.containsKey(id)) {
			System.out.println("존재하지 않는 아이디입니다.");
			return;//강제종료
		}

		System.out.print("비밀번호를 입력하세요: ");
		String password = scan.nextLine();

		if (!memberMap.get(id).equals(password)) {//equals값이 같으면 true
					//id를 가져와서 비밀번호 비교		  //!로 논리뒤집어서 true -> false
										//값이 같은걸 같지않다고 뒤집어 버림
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}

		System.out.println("로그인 성공!");
	}
}
