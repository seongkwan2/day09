package set_get;
class TestClass03{
	private String name;
	private int age;
	
	//직접 입력할수 없으니 set,get을 만들어서 값을 넣어주기로함
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	public String getName() { //set에서 받은 "홍길동" 값을 받아옴
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.setName("홍길동"); //값을 외부에서 넣어줌
		System.out.println(t.getName());
		
		t.setAge(10);
		int age = t.getAge();
		System.out.println(age);		//두개의 방법
		
		System.out.println(t.getAge());
	}
}









