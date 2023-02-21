package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Study0221_03_파일입출력응용예제1 {
	public static void main(String[] args) {
		ScoreFile ss = new ScoreFile();

	}
}
class ScoreFile{
	Scanner sc = new Scanner(System.in);
	int sel;//메뉴선택용
	
	ScoreFile()
	{
		while(true)
		{
			System.out.println("1.점수입력");
			System.out.println("2.점수출력");
			System.out.println("3.종료");
			System.out.print("선택:");  sel = sc.nextInt();
			if(sel == 1) 	  {
				System.out.print("이름:");  String name = sc.next();					
				System.out.print("국어:");  int kor= sc.nextInt();
				System.out.print("영어:");  int eng = sc.nextInt();
				System.out.print("수학:");  int mat = sc.nextInt();
				int tot = kor + eng + mat;
				int avg = tot/3;
				try {
					PrintWriter ppp = new PrintWriter(
							new BufferedWriter(
							new FileWriter(
							new File(
							new File("c:\\java\\work"), "score.txt"),true)));
					ppp.println(name+" / 총점 : "+tot+" / 평균 : "+avg);
					ppp.close();
				} catch (IOException e) {}
			}
			else if(sel == 2) {
				BufferedReader in;
				try {
					in = new BufferedReader(new FileReader(new File(
							new File("c:\\java\\work"), "score.txt")));
					
					String data;
					//data변수에 파일로부터 읽어서 빈곳이 아니라면 한줄씩
					//자동으로 넘어가면서 읽음.
					while((data = in.readLine()) != null) {
						System.out.println(data);
					}
					
					in.close();
					
				} 
				catch (FileNotFoundException e) {	}
				catch (IOException e) {	}

				
				
			}
			else if(sel == 3) {System.out.println("\n프로그램종료");break;}
		}
	}
}








