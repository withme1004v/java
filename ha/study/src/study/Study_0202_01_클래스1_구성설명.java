package study;

public class Study_0202_01_클래스1_구성설명 {

	public static void main(String[] args) {
		Test t = new Test();
		t.hello();
		System.out.println("t변수 age값 : "+ t.age);
		System.out.println("t변수 height값 : "+ t.height);
		System.out.println("t변수 name값 : "+ t.name);

	}

}
class Test {
	//변수 = 필드 = 멤버변수 = 클래스내부변수
	int age = 20;
	double height = 177.77;
	String name = "테스트";
	//생성자
	Test()
	{
		
	}
	void hello() {
		System.out.println("하이");
	}
	
}