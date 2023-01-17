package study;

public class Study1_2 {

	public static void main(String[] args) {
		//1비트
		//8비트 = 1바이트
		//변수
		String name;
		int age;
		String addr;
		name = "홍길동";
		age = 22;
		addr = "대전";
		//가장 많이 쓰는 3가지
		int num = 2100000000;//-21억~21억사이의 정수
		double dNum = 178.5;//소수점자리
		String name1 ="홍길동";
		
		//////////////////
		byte bNum = 127;//-128~127 정수저장
		short sNum = 32000;//-32000~32000정수 저장
		long lNum = 21000000000L;//int범위 값 이상의 정수 저장
		float aNum = 1.78f;//double보다 작은 소수점자리저장
		char cName1 = '한';//글자하나 저장(한글가능)
		char cName = 'a';//글자하나 저장
		char cName3 = 21121;//-32000~32000정수저장
		System.out.println(num);
		System.out.println(dNum);
		System.out.println(bNum);
		System.out.println(lNum);
		System.out.println(aNum);
		System.out.println(cName1);
		System.out.println(cName);
		System.out.println(cName3);

	}

}
