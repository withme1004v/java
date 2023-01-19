package study;

import java.util.Scanner;

public class study0119_06_실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jumsu;
		System.out.print("점수를 입력하시오");
		jumsu = sc.nextInt();
		if(jumsu == 100)
		{
			System.out.println("반 1등 입니다!");	
		}
		else if( jumsu >= 90) 
		{
			System.out.println("우등생입니다!");	
		}
		else 
		{
			System.out.println("보통입니다!");	
		}
	}

}
