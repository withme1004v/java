public class Round15_Ex07 {
	public static void main(String[] args) {
		try{
			System.out.print("x = ");
			int x = System.in.read() - 48;
			System.out.println("x = " + x);
		}catch(java.io.IOException io) {
			System.err.println("���� �� ������.");
			System.exit(0);
		}
	}
}
