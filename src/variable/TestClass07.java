package variable;

import java.util.Scanner;
/*
입력, 출력, 나이 만으로 연산하는 각각의 기능을 만드세요
변수는 인스턴스 변수로 변경하여 사용하세요
*/
public class TestClass07 {
	private int age;
	private String name;
	
	//이름 입력
	public void myInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력: ");
		name = scan.next();
		System.out.println("나이 입력: ");
		age = scan.nextInt();
	}
	//나이 연산
	public void setAge() {
		age = age-1;
		
	}
	//출력
	public void display() {
		System.out.println("이름: "+name);
		System.out.println("만 나이: "+age);
	}
	
}
