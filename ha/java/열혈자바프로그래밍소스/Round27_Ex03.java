import java.sql.*;

public class Round27_Ex03 {
	public static void main(String[] args) {
		// 1. ����̺긦 �˻� (Readme.txt ����)
		// oracle => com.oracle.OracleDriver
		// my-sql => org.gjt.mm.mysql.Driver
		// odbc => jdbc.odbc.JdbcOdbcDriver : jdk1.2 �̻󿡼��� �⺻��ġ
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("����̺갡 �ֽ��ϴ�~! ^_^v");
		} catch (ClassNotFoundException ee) {
			System.out.println("����̺� ����!!");
		}
		// 2. Connection ��ü���� (Readme.txt ����)
		// Connection conn = DriverManager.getConnection(
		// "protocol:subprotocol:sid", "id", "pass");
		// oracle => "jdbc:oracle:thin@124.61.53.124:1521/java"
		// my-sql => "jdbc:mysql://124.61.53.124:3306/java"
		// odbc => "jdbc:odbc:java"
		Connection conn = null;
		String url = "jdbc:mysql://124.61.53.124:3306/java";
		String user = "root";// ID
		String password = "12345678";// ��й�ȣ
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("����Ǿ����ϴ�.");
		} catch (SQLException ee) {
			System.err.println("���ᰴü ��������!!");
		}
		// 3. Query ���� Ŭ���� ����
		// Statement stmt = conn.createStatement();
		// PrepareStatment pstmt = conn.prepareStatement(query);
		String query = "select * from Round27_Ex02Table";
		Statement stmt = null;
		String pquery = "insert into Round27_Ex02Table values (null, ?)";
		PreparedStatement pstmt = null;
		try {
			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(pquery);
			pstmt.setString(1, "������");
			pstmt.executeUpdate();
			System.out.println("���༺��");
		} catch (SQLException ee) {
			System.err.println("Query ���� Ŭ���� ���� ����~!! : " + ee.toString());
		}
		// 4. ResultSet ��ü����
		// ResultSet rs = stmt.executeQuery(query);
		// ResultSet rs = pstmt.executeQuery();
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				System.out.println(num + " : " + name);
			}
		} catch (SQLException ee) {
			System.err.println("������ ȹ�����!!");
		}
		// 5. Close �۾�
		try {
			rs.close();
			pstmt.close();
			stmt.close();
			if (conn != null) {
				if (!conn.isClosed()) {
					conn.close();
				}
				conn = null;
			}
		} catch (SQLException ee) {
			System.err.println("�ݱ� ����~!!");
		}
	}
}
