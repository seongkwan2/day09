package variable;
class TestClass05{
	static int num;
	static {
		num = 1000;		//static을 초기화 하는 방법
	}
	
	public void test() {
		System.out.println("num : "+num);
	}
	
	int n1 = 100;
	public static void test2() {
		//System.out.println("n1 : "+n1); //순서상 static 이 먼저 생성되기때문에
										//int n1 = 100; 이 인식되지 않음
	}
}
public class MainClass05 {
	public static void main(String[] args) {
		System.out.println(TestClass06.PATH);
		
	}
}
