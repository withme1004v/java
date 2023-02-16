//에어컨프로그램

package study;

import java.util.Scanner;

public class Study_0216_01_스레드3 {
	public static void main(String[] args) {
		aircon acc = new aircon();
}
}
class aircon {
	Scanner sc = new Scanner(System.in);
	int num;
	int Max = 100;
	int i = 0;
	//String bank_num[] = new String[Max];//계좌번호
	int accCnt = 0;
	//String account[] = new String[Max];//계좌번호
	//String name[] = new String[Max];//예금주
	//String pass[] = new String[Max];//비밀번호
	//int accmoney[] = new int[Max];//잔액
	String name[] = {"홍길동","아무개","둘리","김기사","테스터"};
	String account[] = {"1","2","3","4","5"};
	String pass[] = {"1","2","3","4","5"};
	int accmoney[] = {1000,2000,3000,4000,5000};
	Account()
	{
		while(true)
		 {
		  System.out.println("에어컨프로그램");
		  System.out.println("1.에어컨가동");
		  System.out.println("2.온도설정");
		  System.out.println("3.종료");
		  System.out.print("선택 :");
		  num = sc.nextInt();
		  if(num == 1) {
			  Check();
		  }
		  else if(num == 2) 
		  {
			  inMoney();
		  } else if(num == 6) {
				System.out.println("프로그램종료");
				break;
			}
	}
	 }//생성자로 무한루트로 생성
	void inMoney() {
		System.out.print("계좌번호 : "); String bank_name = sc.next();
		System.out.print("비밀번호 : "); String bank_pass = sc.next();
		boolean accCheck = false;
		for(int n = 0; n<account.length; n++)  
			
		{
		if(bank_name.equals(account[n]))
		{
			accCheck = true;
			if( bank_pass.equals(pass[n])) 
			{
				System.out.print("입금액 : "); int bank_in = sc.nextInt();
				accmoney[n]+= bank_in;
			}
			else
			{
				System.out.println("비밀번호가 틀립니다"); break;
			}
		}
	}
		if(accCheck == false)
		{
			System.out.println("없는 계좌번호입니다"); 
		}
    
}
		
	
	void outMoney() {
		System.out.print("계좌번호 : "); String bank_name = sc.next();
		System.out.print("비밀번호 : "); String bank_pass = sc.next();
		boolean accCheck = false;
		for(int n = 0; n<account.length; n++)  
			
		{
		if(bank_name.equals(account[n]))
		{
			accCheck = true;
			if( bank_pass.equals(pass[n])) 
			{
				System.out.print("출금액 : "); int bank_in = sc.nextInt();
				if(bank_in < accmoney[n])
				{
					accmoney[n]-= bank_in;
				}
				else {
					System.out.println("잔액이 부족합니다"); break;
				}
				
			}
			else
			{
				System.out.println("비밀번호가 틀립니다"); break;
			}
		}
	}
		if(accCheck == false)
		{
			System.out.println("없는 계좌번호입니다"); 
		}
    
}
	void Check() {
		
		System.out.print("계좌번호 : "); String bank_name = sc.next();
		System.out.print("비밀번호 : "); String bank_pass = sc.next();
		boolean accCheck = false;
		for(int j = 0; j<account.length; j++) 
			
		{
			
		//if(name[j] == man) { 문자비교는 안됨
			//if(bank_name.equals(account[j]) && bank_pass.equals(pass[j]))
			if(bank_name.equals(account[j]))
			{
				accCheck = true;
				if( bank_pass.equals(pass[j])) 
				{
					System.out.println("현재 잔액은 "+accmoney[j]+"원 입니다"); break;
				}
				else
				{
					System.out.println("비밀번호가 틀립니다"); break;
				}
			}
		}
			if(accCheck == false)
			{
				System.out.println("없는 계좌번호입니다"); 
			}
	    
	}
	void creatAcc() {
		
			System.out.print("계좌번호 : "); account[i]= sc.next();
			System.out.print("예금주 : "); name[i]= sc.next();
			System.out.print("비번 : "); pass[i]= sc.next();
			System.out.print("입금액 : "); accmoney[i]= sc.nextInt();
	}
	void listAcc() 
	{
		for(int n = 0; n <account.length; n++)
		{
			System.out.print((n+1)+ "번 예금주 : "+ name[n]+ "계좌번호 : "+account[n]+"잔액 : "+accmoney[n]+"\n");
		}
		
	}
}
