package study;

public class Study_0131_03_메소드1 {

	public static void main(String[] args) {
		//메소드의 4가지 규칙
		//첫번째형태 리턴 x 전달값 x
		//예시: 철수야 밖에서 놀다가 들어와!
		chulsu();//호출
		//두번째형태 리턴 x 전달값 o	
		//예시: 철수야 10000원 줄테니 햄버거 사먹어!
		chulsu2(10000,"햄버거");
		//세번째형태 리턴 o 전달값 x
		//예시: 철수야 올때 봉지 2개만 가져다줘!
		int cnt = chulsu3();
		System.out.println("철수야 올때 봉지" +cnt+"개만 가져다줘!");
		//네번째형태 리턴 o 전달값 o
		//예시: 철수야 50000원 줄테니 케잌 1개만 사다줘!
		int cnt2 = chulsu4(50000);
		System.out.println("철수야 50000원 줄테니 케잌" +cnt2+"개만 가져다줘!");
	}
	static void chulsu()
	{
		System.out.println("철수야 밖에서 놀다가 들어와!");
	}
	static void chulsu2(int money, String menu)
	{
		System.out.println("철수야" +money+"원 줄테니"+menu+"사먹어");
	}
    static int chulsu3()
    {
    	return 2;
    }
    static int chulsu4(int money1)
    {
    	int cakePrice = 50000;
    	return cakePrice/money1;
    }
}
