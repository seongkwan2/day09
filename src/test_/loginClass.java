package test_;

import java.util.Scanner;

public class loginClass {
	private String id;
	private String pwd;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println("===로그인===");
		System.out.println("아이디를 입력하세요\n>>>");
		String inputId = scan.next();
		System.out.println("비밀번호를 입력하세요\n>>>");
		String inputPwd = scan.next();

		if(id != null && id.equals(inputId)
				&& pwd != null && pwd.equals(inputPwd)) {
			System.out.println("로그인에 성공했습니다.");
		}else {
			System.out.println("아이디와 비밀번호를 다시 확인해주세요");
		}

	}


	public void register() {//회원 가입
		Scanner scan = new Scanner(System.in);
		System.out.println("===회원가입===");

		System.out.println("아이디를 입력해주세요\n>>>");
		String newId = scan.next();
		if(newId.equals(id)) {
			System.out.println("이미 존재하는 아이디 입니다.");
		}else {
			System.out.println("비밀번호를 입력해주세요\n>>>");
			String newPwd = scan.next();
			id = newId;
			pwd = newPwd;
			System.out.println("회원가입에 성공했습니다.");

		}
	}		


	public void myInfo() {	//내 정보 확인
		System.out.println("===내 정보 확인===");
		if(id == null) {
			System.out.println("로그인 이후 이용가능합니다.\n");
		}else {
			System.out.println("현재 로그인 하신 아이디는\n"+id+"입니다.");
		}
	}


	public void edit() {	//비밀번호 변경
		Scanner scan = new Scanner(System.in);
		System.out.println("===비밀번호 변경하기===");
		if(id == null) {
			System.out.println("로그인 이후 이용가능합니다.\n");
		}else {
			System.out.println("현재 비밀번호를 입력하세요\n>>>");
			String inputPwd = scan.next();

			if(pwd != null && pwd.equals(inputPwd)) {
				System.out.println("인증 되었습니다.");
				System.out.println("새로운 비밀번호를 입력하세요\n>>>");
				String newPwd = scan.next();
				System.out.println("한번 더 새로운 비밀번호를 입력하세요\n>>>");
				String newnewPwd = scan.next();
				if(newPwd.equals(newnewPwd)) {
					pwd = newPwd;
					System.out.println("비밀번호가 변경되었습니다.\n");
					System.out.println("다시 로그인 해주세요.");
				}else {
					System.out.println("입력하신 비밀번호 두개가 맞지 않습니다.");
					System.out.println("비밀번호를 다시 확인해주세요.\n");
				}
			}else {
				System.out.println("비밀번호를 다시 확인해주세요\n");
			}
		}
	}
}









