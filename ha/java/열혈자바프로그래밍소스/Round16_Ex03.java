import java.io.*;

public class Round16_Ex03 {
	public static void main(String[] args) {
		/*
		 * File f = new File("c:\\java\\work1"); boolean bool = f.mkdir();
		 * if(bool) System.out.println("�� ����� ����."); else
		 * System.out.println("����� ���д�.");
		 */
		// work������ abc.txt�� ���ٸ�
		// abc.txt��� ������ �����ϴ�. ��� �߸� �ǰ�
		// work������ abc.txt�� �ִٸ�
		// ���ϸ� : abc.txt
		// ���� ��� : c:/java/work
		// ���� ũ�� : 0kb
		// ���� ������ : Aug 31 2005, 15:22:47 �̶�� ����ϸ� �ȴ�.
		// �׸��� ���α׷� ����� ���� �����Ѵ�.
		File f = new File("c:\\java\\work\\abc.txt");
		if (f.exists()) {
			f.deleteOnExit();
			System.out.println("���ϸ� : " + f.getName());
			System.out.println("���� ��� : " + f.getPath());
			System.out.println("���� ��� : " + f.getParent());
			System.out.println("���� ũ�� : " + +f.length() + "kb");
			System.out.println("���� ������ : "
					+ new java.util.Date(f.lastModified()));
		} else {
			System.out.println(f.getName() + "��� ������ �����ϴ�.");
		}
	}
}
