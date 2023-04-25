package set_get;
/*
 this
 - 클래스 자기 자신의 주소를 저장하고 있는 변수
 - 메소드의 0번째 매개변수로 자동으로 만들어져 있다.
 */

class TestClass01{
	int num = 100;
	public void test() {
		int age;
		System.out.println("this: "+this);
		this.num = 200;
		num = 2222;		//바깥의 num을 초기화 시켰음 this로 가져와서
	}
	public void test2() {
		int num = 12345;
		System.out.println(num);		//일반 num은 가까이 있는 num
		System.out.println(this.num);	//this는 바깥의 num을 의미
	}
	
}
public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		System.out.println(t);
		t.test();
		t.test2();
		
	}
}
