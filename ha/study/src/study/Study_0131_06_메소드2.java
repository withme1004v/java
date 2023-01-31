package study;

import java.util.Scanner;

public class Study_0131_04_메소드1 {
	
	public static void main(String[] args) {
		int num1, num2;
		String sik;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 :");num1 = sc.nextInt();
		System.out.print("수2 :");num2 = sc.nextInt();
		System.out.print("연산자(+,-,*,/) :");	sik = sc.next();
		//System.out.println("결과 :"+(num1 sik num2));
		//리턴값 x 전달값x
		if(sik.equals("+")) {
			System.out.println("결과 :"+add(num1, num2));
		} else if (sik.equals("-"))
		{
			System.out.println("결과 :"+min(num1, num2));
		}
		else if (sik.equals("*"))
		{
			System.out.println("결과 :"+mul(num1, num2));
		}
		else if (sik.equals("/"))
		{
			System.out.println("결과 :"+div(num1, num2));
		}
	}
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	static int min(int num1, int num2) {
		return num1 - num2;
	}
	static int mul(int num1, int num2) {
		return num1 * num2;
	}
	static int div(int num1, int num2) {
		return num1 / num2;
	}

}
