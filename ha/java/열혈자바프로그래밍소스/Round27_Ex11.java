import java.sql.*;
import java.io.*;

public class Round27_Ex11 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Round27_Ex10 dao = new Round27_Ex10();
		while (true) {
			System.out.print("1.ȸ������  2.�α���  3.��������  4.��������  5.���� = ");
			int x = System.in.read() - 48;
			System.in.read();
			System.in.read();
			if (x == 1) {
				System.out.println("ȸ������ ������ �Դϴ�.");
				System.out.print("�̸� : ");
				String name = in.readLine();
				System.out.print("ID : ");
				String id = in.readLine();
				System.out.print("Password : ");
				String pass = in.readLine();
				System.out.print("e-mail : ");
				String email = in.readLine();
				boolean bool = dao.registerMember(name, id, pass, email);
				if (bool)
					System.out.println("ȸ�����Կ� �����Ͽ����ϴ�~!");
				else
					System.out.println("ȸ�����Կ� �����Ͽ����ϴ�!!");
				System.out.println();
			} else if (x == 2) {
				System.out.println("�α��� ������ �Դϴ�.");
				System.out.print("ID : ");
				String id = in.readLine();
				System.out.print("Password : ");
				String pass = in.readLine();
				boolean bool = dao.loginMember(id, pass);
				if (bool)
					System.out.println("�α��ο� �����Ͽ����ϴ�~!");
				else
					System.out.println("�α��ο� �����Ͽ����ϴ�");
				System.out.println();
			} else if (x == 3) {
				System.out.println("�������� ������ �Դϴ�.");
				System.out.print("ID : ");
				String id = in.readLine();
				System.out.print("�̸� : ");
				String name = in.readLine();
				System.out.print("Password : ");
				String pass = in.readLine();
				System.out.print("e-mail : ");
				String email = in.readLine();
				boolean bool = dao.editMember(id, name, pass, email);
				if (bool)
					System.out.println("ȸ�������� �����Ͽ����ϴ�~!");
				else
					System.out.println("ȸ�������� �������� ���Ͽ����ϴ�!!");
				System.out.println();
			} else if (x == 4) {
				System.out.println("�������� ������ �Դϴ�.");
				System.out.print("ID : ");
				String id = in.readLine();
				boolean bool = dao.deleteMember(id);
				if (bool)
					System.out.println("ȸ�������� �����Ǿ����ϴ�~!");
				else
					System.out.println("ȸ�������� �������� ���Ͽ����ϴ�!!");
				System.out.println();
			} else if (x == 5) {
				System.exit(0);
			} else {
				System.err.println("�߸� �Է�!!");
			}
		}
	}
}
