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

public class Study_0207_07_클래스_상속예제 {
	public static void main(String[] args) {	
		Child c = new Child();
		
    }
}
class Parent {
	String house = "아파트";
	String car = "벤츠";
	int money = 20000000;
	
}
class Child extends Parent{
	String car = "아반떼";
	int money = 2000;
	Child()
	{
		System.out.println("현재자산 car : "+car);
		System.out.println("현재자산 money : "+money);
		System.out.println("현재자산 house : "+house);
		System.out.println("현재자산 부모 car : "+super.car);
		System.out.println("현재자산 부모 money : "+super.money);
	}
}