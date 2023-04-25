package variable;

import java.util.Scanner;

public class TestClass08 {
	// 입력, 연산, 출력 기능을 만들어주세요
	// 입력: 이름, 국, 영, 수
	// 연산: 합을 구하는 기능, 평균을 구하는 기능, 등급을 구하는 기능
	// 출력: 이름, 국, 영, 수, 합, 평균, 등급
	// 등급: 평균이 90이상 A, 80이상 B 나머진 C
	
	String name, grade;
	private int kor, eng, math, sum;
	double avg;
	
	public void myInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력: ");
		name = scan.next();
		System.out.println("국어점수: ");
		kor =  scan.nextInt();
		System.out.println("영어점수: ");
		eng = scan.nextInt();
		System.out.println("수학점수: ");
		math = scan.nextInt();
	}
	
	public void add() {
		sum = kor+eng+math;
	}
	
	public void average() {
		avg = sum/3;
	}
	public void total() {
		
		if(avg>=90) {
			grade = "A";
		}else if(avg>=80) {
			grade = "B";
		}else {
			grade = "C";
		}
	}
	public void output() {
		System.out.println("이름: "+name);
		System.out.println();
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+math);
		System.out.println();
		System.out.println("합계점수: "+sum);
		System.out.println("평균점수: "+avg);
		System.out.println("등급: "+ grade);
		//total(sum);
		
		
	}
}

















