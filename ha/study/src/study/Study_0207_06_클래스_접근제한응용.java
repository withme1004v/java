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

public class Study_0207_06_클래스_접근제한응용 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		Bank1 k1 = new Bank1();
		System.out.print("아이디 : ");String id=sc.next();
		System.out.print("패스워드 : ");String pw=sc.next();
		k1.getInfo(id, pw);
    }
}
class Bank1 {
	private String 예금주 = "홍길동";
	private String 계좌번호 = "1234567";
	private int 잔액 = 21000000;
	private String id ="admin";
	private String pw ="1004";
	void getInfo(String id, String pw)
	{
		if(id.equals(this.id))
		{
			if(pw.equals(this.pw))
			{
				System.out.println("현재예금주 : " + 예금주);
				System.out.println("계좌번호 : " + 계좌번호);
				System.out.println("잔액 : " + 잔액);
			}
			else
			{
				System.out.println("패스워드가 다릅니다");
			}
			
		}
		else
		{
			System.out.println("아이디 패스워드가 다릅니다");
		}
	}
}