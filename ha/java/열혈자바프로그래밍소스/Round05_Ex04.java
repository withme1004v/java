package 열혈자바프로그래밍소스;

public class Round05_Ex04 {
	public static boolean aaa() {
		System.out.println("AAA");
		return true;
	}
	public static boolean bbb() {
		System.out.println("BBB");
		return false;
	}
	public static void main(String[] ar) {
		boolean b = aaa() || bbb(); //앞의 값이 참이면 뒤에값을 실행하지 않는다 or
		System.out.println("b = " + b);
	}
}
