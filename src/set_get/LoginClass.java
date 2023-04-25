package set_get;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class LoginClass {

	private String id, pwd;


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
        System.out.println("\n=== 로그인 ===");
        System.out.print("ID를 입력하세요: ");
        String inputId = scan.next();
        System.out.print("비밀번호를 입력하세요: ");
        String inputPwd = scan.next();

        if (id != null && id.equals(inputId) && //id = 저장해놓은것 
        										//equals(inputId) 비교대상(입력한값)
        										//id.equals(inputId) id와 입력한값 비교
        		pwd != null && pwd.equals(inputPwd)) {
            System.out.println("로그인 성공!");
        } else {
            System.out.println("로그인 실패.");
        }
    }
	
	
	public void signup() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===회원가입을 합니다.===");
		System.out.println("아이디를 입력해주세요>>");
		String newId = scan.next();
		System.out.println("비밀번호를 입력해주세요>>");
		String newPwd = scan.next();
		
		setId(newId);
		setPwd(newPwd);

		System.out.println("회원가입이 되었습니다.\n");
	}
}






















