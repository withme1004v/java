package study;

import java.util.Scanner;

public class Study_0126_09_배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Max = 3;
		int kor[] = new int[Max];
		int eng[] = new int[Max];
		int mat[] = new int[Max];
		int tot[] = new int[Max];
		int avg[] = new int[Max];
		
		for(int i = 0; i<Max; i++) {
			System.out.print(i+1+"번학생국어: "); kor[i] = sc.nextInt();
			System.out.print(i+1+"번학생영어: "); eng[i] = sc.nextInt();
			System.out.print(i+1+"번학생수학: "); mat[i] = sc.nextInt();
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/Max;
		}
		for(int i = 0; i<Max; i++) {
			System.out.println(i+1+"번학생총점: "+tot[i]+"평균 :"+avg[i]);
		}

		

	}

}
