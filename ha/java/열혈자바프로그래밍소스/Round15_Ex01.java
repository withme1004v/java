class A1 implements Runnable {
	public void run() {
		System.out.println("\nHere is MyThread!!");
		for(int i = 0; i < 100; i++) {
			for(char ch = 'A'; ch <= 'z'; ch++) {
				System.out.print(ch);		
			}
		}
	}
}
public class Round15_Ex01 {
	public static void main(String[] args) {
		System.out.println("Main Thread!!!");
		A1 mt = new A1();
		Thread myth = new Thread(mt);
		myth.start();
		for(int i = 1; i < 1000; i++) {
			System.out.print(i);
			if(i % 10 == 0) System.out.println();
			else System.out.print("\t");
		}
		System.out.println("\nMain Thread Destroy!!");
	}
}
