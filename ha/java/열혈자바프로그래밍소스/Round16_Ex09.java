import java.io.*;

public class Round16_Ex09 {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				new File(new File("c:\\java\\work"), "kim.txt"))));
		PrintWriter out1 = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter(System.out)));
		out.println("���Ͽ� ���´�. ");
		out1.println("ȭ�鿡 �Ѹ���. ");
		out.close();
		out1.close();
	}
}
