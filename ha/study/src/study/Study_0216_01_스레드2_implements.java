//친구관리프로그램
//1. 친구추가
//2. 친구보기
//3. 친구수정
//4. 종료
//션택

//1번 친구등록
//이름 : 홍길동
//연락처 01012341234
//2
//1번 홍길동 / 01012341234
//2번 ㅣㅣㅣ
//3
//수정친구이름 : 
//기존정보 ( 홍길동 / 01012341234)
//수정할 이름 : 김길동
//수정할 연락처 : 4444444
package study;

public class Study_0216_01_스레드2_implements {
	public static void main(String[] args) {
		TestTh3 th3 = new TestTh3();
		Thread a = new Thread(th3);
		a.start();
		TestTh4 th4 = new TestTh4();
		Thread b = new Thread(th4);
		b.start();
}
}
class TestTh3 implements Runnable {
	public void run()
	{
		int i=1;
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println("안녕하세요 :" + i);
			i++;
			if(i==100) {break;}
		}

	}
}
class TestTh4 extends Thread {
	public void run() {		
		for(int i=2; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				System.out.println(i+" X "+j+" = "+i*j);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {}
			}
		}



	}
}