package study;

public class Study_0302_05_드라이버 {
	public static void main(String[] args) {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("드라이버가 정상 설치되었습니다.");
		} catch (ClassNotFoundException ee) {
			System.err.println("드라이버 없당~!");
		}
	}
}
