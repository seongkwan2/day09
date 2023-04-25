package variable;
class TestClass04{
	static int num = 1000;
	//static 을 사용하면 클래스 이름으로 접근가능
}
public class MainClass04 {
	public static void main(String[] args) {
		TestClass04.num = 4444;
		//클래스 이름으로 접근한 모습

	}
}
