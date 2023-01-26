package study;

public class Study_0126_08_배열 {

	public static void main(String[] args) {
		//String name1, name2;
		//배열: 동일한 데이터 타입의 집합
		String name[] = new String[5];
//		name[0] = "홍길동0";
//		name[1] = "홍길동1";
//		name[2] = "홍길동2";
//		name[3] = "홍길동3";
//		name[4] = "홍길동4";
		for(int i = 0; i<5; i++) {
			name[i] = "홍길동"+i;
			System.out.println(name[i]);
		}

	}

}
