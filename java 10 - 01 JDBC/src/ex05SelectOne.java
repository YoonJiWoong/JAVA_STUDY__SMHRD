import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ex05SelectOne {

	public static void main(String[] args) {
		// Ư�� ȸ���� ID�Է��ϸ� -> �ش� ID�� ���� ȸ���� ������ ���
		// ID�� ��ġ�� �ʴ´�! ��� ����

		Scanner sc = new Scanner(System.in);
		System.out.println("== Ư�� ȸ������ ��� ==");
		System.out.print("id �Է� : ");
		String inputid = sc.next();

		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

			String dbid = "hr"; // id
			String dbpw = "hr"; // pw

			conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "select * from jdbc_member where id=?"; // ; ���� �ۼ�

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inputid); //index�� 1���� ���� / �������̸� setIndex

			rs = psmt.executeQuery(); // ����Ʈ

			while (rs.next()) { // rs.next ��ü�� true �� false
				
				// 1==1 ->  true , rs.next()=true �̷��� �ᵵ �Ǳ�Ǵµ� �Ƚᵵ��
				
				// ������ �÷��� �о����
				String id = rs.getString(1); // �÷��� ����(1���� ����) ���� / ù��° �������ڴ�. ���⼱ id
				String pw = rs.getString(2); // �÷� �̸�(String)�����ؼ� ������ ����
				String nick = rs.getString(3);
				// rs.getDate() ��¥�϶���
				System.out.println("id :" + id);
				System.out.println("pw :" + pw);
				System.out.println("nick :" + nick);
				System.out.println("==================");

			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {

				rs.close();
				psmt.close();
				conn.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
