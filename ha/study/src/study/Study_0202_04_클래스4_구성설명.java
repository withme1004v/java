package study;

import java.util.Scanner;

public class Study_0202_04_클래스4_구성설명 {
	static int kor = 0, eng = 0, mat = 0;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num;
		 
		 while(true)
		 {
		  System.out.println("국영수점수프로그램");
		  System.out.println("1.입력");
		  System.out.println("2.출력");
		  System.out.println("3.종료");
		  System.out.print("선택 :");
		  num = sc.nextInt();
		  if(num == 1) {
		   in();
		  }
		  else if(num == 2) 
		  {
			  System.out.println("총점 : "+ (kor+eng+mat)+"/ 평균 : "+ (kor+eng+mat)/3); 
		  }
		  else if(num == 3) {
				System.out.println("프로그램종료");
				break;
			}
	}

}
	static void in() {
		System.out.print("국어"); kor = sc.nextInt();
		System.out.print("영어"); eng = sc.nextInt();
		System.out.print("수학"); mat = sc.nextInt();
	}
}