import java.io.*;

public class Round16_Ex07 {
	public static void main(String[] args) throws IOException {
		/*
		 * File dir = new File("c:\\java\\work"); File file = new File(dir,
		 * "kimsh.txt"); FileOutputStream fos = new FileOutputStream(file);
		 * BufferedOutputStream bos = new BufferedOutputStream(fos);//512byte
		 * //BufferedOutputStream bos1 = //new BufferedOutputStream(fos,
		 * 1024);//1024byte DataOutputStream dos = new DataOutputStream(bos);
		 */
		// 1byte ����� ���� ��ü
		DataOutputStream dos1 = new DataOutputStream(new BufferedOutputStream(
				new FileOutputStream(new File(new File("c:\\java\\work"),
						"kimsh.txt"))));
		dos1.writeInt(23);
		dos1.writeDouble(12.345);
		dos1.writeBytes("ABCDEFG!!!");
		dos1.close();
	}
}
