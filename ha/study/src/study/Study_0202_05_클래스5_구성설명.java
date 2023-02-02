package study;

import java.util.Scanner;

public class Study_0202_05_클래스5_구성설명 {
	public static void main(String[] args) {
		Score t = new Score();
}
}
class Score {
	Scanner sc = new Scanner(System.in);
	int num;
	int kor, eng, mat, tot = 0, avg = 0; 
	Score()
	{
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
			  out();
		  }
		  else if(num == 3) {
				System.out.println("프로그램종료");
				break;
			}
	}
	 }//생성자로 무한루트로 생성
	void in() {
		System.out.print("국어"); kor = sc.nextInt();
		System.out.print("영어"); eng = sc.nextInt();
		System.out.print("수학"); mat = sc.nextInt();
		tot = kor + eng + mat;
		avg = tot /3;
	}
	void out() {
		System.out.println("총점 : "+ tot +"/ 평균 : "+ avg); 
	}
}
