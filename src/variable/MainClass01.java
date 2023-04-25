package variable;

/*
 클래스 변수(class variable)
 - 클래스가 메모리에 올라가는 순간 생성된다.
 - 클래스 이름으로 접근 가능하다
 - 프로그램이 실행되면 static으로 만들어진 모든 것들이 생성된다.
 	즉, 메모리에 공간을 차지하게 되며, 사라지는 시점은
 	프로그램이 종료될때 공간이 사라진다.
 	//제일 처음에 만들어지고, 제일 오래 유지됨
 	//static 을 사용하면 클래스 이름으로 접근가능
 
 객체생성 변수(instance variable)
 - 객체가 생성되어야만 사용 가능한 변수
 - 객체로 접근하여 사용한다.
 - new연산을 통해 객체를 생성할 때 변수 또는 메소드가 실행되며, 해당 변수
 	또는 메소드가 사라지는 시점은 객체가 사라질때 같이 사라진다.
 	객체가 사라진다는 것은 특정 지역이 종료될때를 말한다.
 
 지역 변수(local variable)
 - 특정 지역에서만 사용 가능한 변수
 - 범위 지정은 중괄호 {}이다.
 - 메소드의 호출이 일어나면 변수가 메모리에 올라가고, 메소드가 종료되면
 	자동으로 변수 또한 사라진다.
 	지역변수 < 인스턴스 변수	< 클래스 변수	(범위의 크기)
 */
public class MainClass01 {
	public static void main(String[] args) {
	
		int num = 100;
		if(true) {
			num = 200;
			int abc = 100;
		}
		if(true) {
			//abc = 2000;
		}
		System.out.println(num);
		//System.out.println(abc);
		
	}
}
