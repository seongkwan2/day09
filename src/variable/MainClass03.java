package variable;
class TestClass03{
	int num;
	public void test01() {
		num = 1000;
		System.out.println("test01 : "+num);
	}
	public void test02() {
		System.out.println("test02 : "+num);
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test01();
		t.test02();
		
		System.out.println("static : "+TestClass04.num);
	}
}
