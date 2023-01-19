package study;

import java.util.Scanner;

public class study0119_05_연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이를 입력하시오");
		age = sc.nextInt();
		if(age > 19) {
			System.out.print("성인입니다");
		}else {
			System.out.print("청소년입니다");
		}
	}

}
