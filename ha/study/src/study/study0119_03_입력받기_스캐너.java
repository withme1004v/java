package study;

import java.util.Scanner;

public class study0119_03_입력받기_스캐너 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.print("이름 :");
		name = sc.next();
		System.out.print("나이 :");
		age = sc.nextInt();
		System.out.println("\n입력한 이름은 :"+name+"입니다.");
		System.out.println("\n입력한 나이는 :"+age+"살 입니다.");
	}

}
