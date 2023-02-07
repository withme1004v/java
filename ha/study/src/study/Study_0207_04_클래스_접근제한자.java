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

public class Study_0207_04_클래스_접근제한자 {
	public static void main(String[] args) {
		Test111 t1 = new Test111();
		Test222 t2 = new Test222();
		System.out.println("Test1의 name : "+t1.name);
		System.out.println("Test2의 name : "+t2.name);
		//System.out.println("Test1의 money : "+t1.money);//접근불가능
		String id = "admin111";
		t1.showMoney(id);
		System.out.println("Test2의 money : "+t2.money);
}
}
class Test111 {
	private int money = 10000;//private은 비공개로 같은 클래스내에서만 접근가능
	String name = "금고";//접근제한자를 명시하지 않아 기본 public상태
	void showMoney(String id)
	{
		if(id.equals("admin"))
				{
		System.out.println("Test1의 money : "+money);
				}
				else
				{
					System.out.println("관리자가 아니므로 TEst1의 금고돈은 접근불가");	
				}
	}
	}
class Test222 {
	public int money = 20000;//public은 공개로 어디서든지 접근가능
	String name = "지갑";//접근제한자를 명시하지 않아서 기본 public상태
	}
