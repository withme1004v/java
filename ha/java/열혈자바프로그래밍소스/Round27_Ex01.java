public class Round27_Ex01 {
	public static void main(String[] args) {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("����̹��� ���� ��ġ�Ǿ����ϴ�.");
		} catch (ClassNotFoundException ee) {
			System.err.println("����̹� ����~!");
		}
	}
}
