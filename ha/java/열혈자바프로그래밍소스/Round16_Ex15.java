import java.io.*;
import java.util.*;

public class Round16_Ex15 {
	public static void main(String[] args) throws ClassNotFoundException,
			IOException {
		File dir = new File("c:\\java\\work");
		File file = new File(dir, "myfriends.dat");
		Vector vc = new Vector();
		if (file.exists()) {
			ObjectInputStream ois = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(file)));
			vc = (Vector) ois.readObject();
			ois.close();
		}
		while (true) {
			System.out.print("1.ģ����� 2.��ü���� 3.���� = ");
			int x = System.in.read() - 48;
			System.in.read();
			System.in.read();
			if (x == 1) {
				Round16_Ex14 ps = new Round16_Ex14();
				vc.add(ps);
				System.out.println("ģ�� 1���� ��� �Ͽ����ϴ�.");
			} else if (x == 2) {
				for (int i = 0; i < vc.size(); i++) {
					Round16_Ex14 imsi = (Round16_Ex14) vc.elementAt(i);
					imsi.disp();
				}
			} else if (x == 3) {
				ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream(file)));
				oos.writeObject(vc);
				oos.close();
				System.exit(0);
			} else {
				System.out.println("�߸� �Է�!!");
			}
		}
	}
}