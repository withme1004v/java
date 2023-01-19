package study;

import java.util.Scanner;

public class study_0119_08_실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int kor;
		//int eng;
		//int math;
		int kor, eng, math;
		System.out.print("국어점수를 입력하시오");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하시오");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하시오");
		math = sc.nextInt();
		int sum = kor + eng + math;
		int avg = sum / 3;
		String hak;
		System.out.print("총점 : "+ sum+ "  평균 : "+ avg);
		if( avg >= 90) {
			hak ="A";
		}
		else if( avg >= 80) {
			hak = "B";
		}
		else if( avg >= 70) {
			hak = "C";
		}
		else if( avg >= 60) {
			hak = "D";
		}
		else {
			hak = "F";
		}
		System.out.print("\n당신의 학점은 "+ hak+ "입니다");
	}

}
