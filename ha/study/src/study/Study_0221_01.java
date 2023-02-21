package study;

import java.io.*;
import java.util.*;



public class Study_0221_01 {
	public static void main(String[] args) throws ClassNotFoundException,
			IOException {
		File dir = new File("c:\\java\\work");
		File file = new File(dir, "myfriends.txt");
		Vector vc = new Vector();
		if (file.exists()) {
			ObjectInputStream ois = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(file)));
			vc = (Vector) ois.readObject();
			ois.close();
		}
		while (true) {
			System.out.println("1.점수입력");
			System.out.println("2.점수출력");
			System.out.println("3.종료");
			System.out.print("선택 : ");
			int x = System.in.read() - 48;
			System.in.read();
			System.in.read();
			if (x == 1) {
				Study_0221_02 ps = new Study_0221_02();
				vc.add(ps);
				System.out.println("친구 1명을 등록 하였습니다.");
			} else if (x == 2) {
				for (int i = 0; i < vc.size(); i++) {
					Study_0221_02 imsi = (Study_0221_02) vc.elementAt(i);
					imsi.disp();
				}
			} else if (x == 3) {
				ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream(file)));
				oos.writeObject(vc);
				oos.close();
				System.exit(0);
			} else {
				System.out.println("잘못 입력!!");
			}
		}
	}
}