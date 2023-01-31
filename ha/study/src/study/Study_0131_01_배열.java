package study;

import java.util.Scanner;

public class Study_0131_01_배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Max = 100;
		int num;
		int i = 0;
		String name[] = new String[Max];
		String tel[] = new String[Max];
		while(true)
		{
			System.out.println("1.사람추가 :");
			System.out.println("2. 전체보기 :");
			System.out.println("3. 종료");	
			System.out.print("선택 :");
			num = sc.nextInt();
			if(num == 1)
			{
				
				System.out.print((i+1)+"번 사람이름 :"); 
				name[i] = sc.next();
				System.out.print((i+1)+"번 사람 연락처 :");
				tel[i] = sc.next();
				System.out.println((i+1)+"명이 추가되었습니다.\n");
				i++;
				
			}
			else if(num ==2)
			{
				for(int n=0;n<i;n++)
				{
					System.out.println((n+1)+"번"+name[n]+"/"+tel[n]);
				}
				
			}
			else if(num == 3)
			{
				System.out.println("프로그램종료"); 
				break;
			}
		}
		
		
		
	}

}
