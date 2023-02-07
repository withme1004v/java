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

public class Study_0207_01_클래스1 {
	public static void main(String[] args) {
		DjInfo t = new DjInfo();
}
}
class DjInfo {
	Scanner sc = new Scanner(System.in);
	int num;
	int i = 0;
	String gu;
	String name[] = {"서구","중구","동구","유성구","대덕구"};
	int su[] = new int[name.length];
	DjInfo()
	{
		while(true)
		 {
		  System.out.println("대전 인구정보 프로그램");
		  System.out.println("1.대전인구입력");
		  System.out.println("2.대전인구보기");
		  System.out.println("3.대전인구수정");
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
		for(int i = 0; i < name.length; i++) 
		{
		System.out.print(name[i]+"(단위:만명) : ");
		 su[i] = sc.nextInt();
		
		}
	}
	void out() {
		System.out.println("총인구 :"+(su[0]+su[1]+su[2]+su[3]+su[4])+"만명"); 
		for(int k = 0; k < name.length; k++) 
		{
		System.out.println(name[k]+" :"+su[k]+"만명");
		}
	}
	void in2() {
		
		System.out.print("수정할 구 입력 : "); gu = sc.next();
		for(int j = 0; j < name.length; j++) 
			
		{
		//if(name[j] == man) { 문자비교는 안됨
			if(gu.equals(name[j])) {
			System.out.println("현재 ( "+name[j]+"/"+su[j]+"만명)");
			System.out.print("수정인구수 : "); su[j] = sc.nextInt(); 
		}
		}
	}
}
