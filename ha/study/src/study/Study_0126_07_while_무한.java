package study;

import java.util.Scanner;

public class Study_0126_07_while_무한 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num;
		 while(true)
		 {
		  System.out.println("1.구구단찍기");
		  System.out.println("2.별표찍기");
		  System.out.println("3.종료");
		 
			System.out.print("선택 :");
			num = sc.nextInt();
			if(num == 1) {
				int i=2, j=1;
				while(i<10) 
				{
					while(j<10) 
					{
					  System.out.println(i+"X"+j+"="+i*j);
					  j++;
					  
					}
					j=1;
					i++;
				}
			}else if(num == 2)
			{
				for(int i=0; i<5; i++)
				{
					for(int j=0; j<=i; j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
			}
			else if(num == 3) {
				System.out.println("프로그램종료");
				break;
			}
	  }

	}

}