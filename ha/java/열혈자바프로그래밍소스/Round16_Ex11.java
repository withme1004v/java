import java.io.*;

public class Round16_Ex11 {
	public static void main(String[] args) throws IOException {
		File dir = new File("c:\\java\\work");
		File file = new File(dir, "ksh.log");
		FileOutputStream fos = new FileOutputStream(file, true);
		BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
		PrintStream ps = new PrintStream(bos);
		System.setErr(ps); // System.err�� ���� �����̷���

		System.out.println("����Ѵ�. ȭ������...");
		System.err.println("����Ѵ�. ���Ϸ�...");

		System.err.close();
	}
}
