import java.io.*;
public class Round15_Ex09 {
	public static int aaa() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int age = 0;
		try {
			System.out.print("���� = ");
			age = Integer.parseInt(in.readLine());
			return age;
		}catch(NumberFormatException nfe) {
			//nfe.printStackTrace();
			System.out.println("error = " + nfe.getMessage());
			//System.out.println();
			return age;
		}catch(IOException ie) {
			return age;
		}finally {
			System.out.println("���� : " + age);
		}
	}
	public static void main(String[] args) {
		System.out.println("Main Start!!");
		aaa();
		System.out.println("Main End!!");
	}
}
