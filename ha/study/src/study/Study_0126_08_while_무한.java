package study;

import java.util.Scanner;

public class Study_0126_08_while_무한 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int i;
	  while(true)
	  {
		  System.out.println("1.입력");
		  System.out.println("2.출력");
		  System.out.println("3.종료");
		 
			System.out.print("선택 :");
			i = sc.nextInt();
			if(i == 3) {
				System.out.println("프로그램종료");
				break;
			}
	  }

	}

}
