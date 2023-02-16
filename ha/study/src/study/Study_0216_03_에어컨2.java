package study;

import java.util.Scanner;

public class Study_0216_03_에어컨2 {
	public static void main(String[] args) {	
		Aircon3 a = new Aircon3();
	}
}
class Aircon3 extends Thread{
	Scanner sc = new Scanner(System.in);
	int sel;//메뉴선택용변수
	int CurTempo=26;//현재온도 기본값 26도 셋팅
	int setTempo=0; //에어컨가동을 위한 셋팅 온도 0도로 셋팅
	boolean airConOn=false; //스레드 제어용
	Aircon3()
	{
		start();
		System.out.println("<에어컨프로그램>");		
		while(true)
		{
			System.out.println("[현재온도:"+CurTempo+"도 / 설정온도:"+setTempo+"도]");
			System.out.println("1.에어컨가동");
			System.out.println("2.온도설정");
			System.out.println("3.현재온도확인");
			System.out.println("4.종료");
			System.out.print("선택:"); sel = sc.nextInt();
			if(sel == 1)      {
				if(setTempo==0){
					System.out.println("\n온도설정부터하세요!(최저18도까지가능)\n");
					continue;
				}				
				//에어컨가동.
				airConOn =true;
			}
			
			
			else if(sel == 2) {
				do {
				System.out.print("설정온도18~29사이가능(현재:"+setTempo+"도): "); setTempo = sc.nextInt();
				}while(setTempo<18 || setTempo>29);
			}
			else if(sel == 3) {System.out.println("현재온도:"+CurTempo+"도");}
			else if(sel == 4) {break;}
		}			
	}
	public void run()
	{
		while(true)
		{
			try {
				//값이 제대로 들어가도 cpu속도가 빨라서 제어가 안되서 딜레이줌.
				Thread.sleep(100);				 
			} catch (InterruptedException e) {}
			if(airConOn==true)
			{
				int randTempo = (int)(Math.random()*2);
				try {
					Thread.sleep(1000);
					CurTempo -=randTempo; 
				} catch (InterruptedException e) {}					
				System.out.println("현재온도:"+CurTempo+"도 / 설정온도:"+setTempo+"도");
				
				if(CurTempo==setTempo) {
					System.out.println("\n설정온도에 도달했습니다.\n");
					airConOn=false;
				};
			}
			else {
				int randTempo = (int)(Math.random()*2);
				try {
					Thread.sleep(3000);
					CurTempo +=randTempo; 
					System.out.println("온도가 증가했습니다.현재온도:"+CurTempo);
				} catch (InterruptedException e) {}		
			}
		}
	}
}