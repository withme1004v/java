package 열혈자바프로그래밍소스;

public class Round04_Ex04 {
	public static void main(String[] ar) {
		System.out.printf("%s\n", "김승현");
		System.out.printf("%10s\n\n", "김승현");//10칸자리잡아라

		String name = "김승현";
		int age = 20;
		System.out.printf("%10s님의 나이는 %05d세 입니다.\n", name, age);
	}
}
