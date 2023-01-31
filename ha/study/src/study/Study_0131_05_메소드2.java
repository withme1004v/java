package study;

import java.util.Scanner;

public class Study_0131_04_메소드1 {
	static int num1, num2;
	public static void main(String[] args) {
		
		String sik;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 :");num1 = sc.nextInt();
		System.out.print("수2 :");num2 = sc.nextInt();
		System.out.print("연산자(+,-,*,/) :");	sik = sc.next();
		//System.out.println("결과 :"+(num1 sik num2));
		//리턴값 x 전달값x
		if(sik.equals("+")) {
			System.out.println("결과 :"+add());
		} else if (sik.equals("-"))
		{
			add();
		}
		else if (sik.equals("*"))
		{
			add();
		}
		else if (sik.equals("/"))
		{
			add();
		}
	}
	static int add() {
		return num1 + num2;
	}
	static int min() {
		return num1 - num2;
	}

}
