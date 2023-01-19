package study;

import java.util.Scanner;

public class study_0119_09_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int kor;
		//int eng;
		//int math;
		int score;
		System.out.print("학점을 입력하시오");
		score = sc.nextInt();
		switch(hak)
		{
		case "A": 
			System.out.print("A학점을 입력하시오");
			break;
		case "B": 
			System.out.print("B학점을 입력하시오");
			break;
		case "C": 
			System.out.print("C학점을 입력하시오");
			break;
		case "D": 
			System.out.print("D학점을 입력하시오");
			break;
			default: 
				System.out.print("F학점을 입력하시오");
		}
		
	}

}
