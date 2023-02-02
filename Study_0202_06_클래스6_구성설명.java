//친구관리프로그램
//1. 친구추가
//2. 친구보기
//3. 친구수정
//4. 종료
//션택

//1번 친구등록
//이름 : 홍길동
//연락처 01012341234
//2
//1번 홍길동 / 01012341234
//2번 ㅣㅣㅣ
//3
//수정친구이름 : 
//기존정보 ( 홍길동 / 01012341234)
//수정할 이름 : 김길동
//수정할 연락처 : 4444444
package study;

import java.util.Scanner;

public class Study_0202_06_클래스6_구성설명 {
	public static void main(String[] args) {
		Friends t = new Friends();
}
}
class Friends {
	Scanner sc = new Scanner(System.in);
	int num;
	int Max = 10;
	int i = 0;
	String man;
	String name[] = new String[Max];
	String tel[] = new String[Max];
	Friends()
	{
		while(true)
		 {
		  System.out.println("친구관리프로그램");
		  System.out.println("1.친구추가");
		  System.out.println("2.친구보기");
		  System.out.println("3.친구수정");
		  System.out.println("4.종료");
		  System.out.print("선택 :");
		  num = sc.nextInt();
		  if(num == 1) {
			  in();
		  }
		  else if(num == 2) 
		  {
			  out();
		  }else if(num == 3) 
		  {
			  in2();
		  }
		  else if(num == 4) {
				System.out.println("프로그램종료");
				break;
			}
	}
	 }//생성자로 무한루트로 생성
	void in() {
		System.out.println("<"+(i+1)+"번 친구등록>"); 
		System.out.print("이름 : "); name[i] = sc.next();
		System.out.print("연락처 : "); tel[i] = sc.next();
		i++;
	}
	void out() {
		for(int n = 0; n<i; n++) 
		{
			System.out.println((n+1)+"번 "+name[n] + "/" + tel[n]); 
		}
		
	}
	void in2() {
		
		System.out.print("수정할 친구이름 : "); man = sc.next();
		for(int j = 0; j<i; j++) 
			
		{
		//if(name[j] == man) { 문자비교는 안됨
			if(man.equals(name[j])) {
			System.out.print("기존정보 ( "+name[j]+"/"+ tel[j]+")");
			System.out.print("수정할이름 : "); name[j] = sc.next(); 
			System.out.print("수정할연락처 : "); tel[j] = sc.next();
		}
		}
	}
}
