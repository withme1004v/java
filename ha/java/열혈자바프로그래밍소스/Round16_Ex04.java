import java.io.*;

public class Round16_Ex04 {
	public static void main(String[] args) {
		// Ư�� ��������
		// Ȯ���ڸ� .java�� ���
		// ����ϵ��� �Ѵ�.
		// ex)
		// 1. CalcTest.java
		// 2. ExceptionTest.java
		// 3. MyException.java
		// 4. ...
		// ... ���... �̷������� ��µǵ����Ѵ�.
		File f = new File("c:\\java\\eclipse\\workspace\\Round16_Examples");
		// String[] files = f.list();
		File[] files = f.listFiles();
		for (int i = 0, j = 0; i < files.length; i++) {
			if (files[i].getName().endsWith(".java")) {
				System.out.println(j++ + 1 + " : " + files[i].getName());
			}
		}
	}
}
