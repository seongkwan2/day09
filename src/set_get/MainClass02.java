package set_get;
class TestClass02{
	private int age;
	
	public void setAge(int age) {
		this.age = age-1;	//this를 안붙히면 다른값이 나옴
							//this를 안붙히면 set(int age)의 값이 오기때문
	}
	
	public void printAge() {
		System.out.println(age);	//현재 메소드안에 age라는 값이 없으면 바깥의 class의 age를 가져옴
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		t.setAge(20);	//여기에 값을 넣으면 메소드의 매개변수에 값 입력(ex: int age)
		t.printAge();
		
	}
}
