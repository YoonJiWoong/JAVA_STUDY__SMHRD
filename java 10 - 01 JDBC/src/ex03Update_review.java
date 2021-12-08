import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03Update_review {

	public static void main(String[] args) {

		// ����ڿ��� id�� pw���� �Է¹ް�
		// �Է¹��� id���� pw�� �����Ͻÿ�.

		System.out.println("ȸ�� ���� ����");
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("1.pw, 2.nick");
		String choice = sc.next();
		System.out.print("������ DATA");
		String data = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;

		try { // try �� �ȿ� if�ᵵ �ȴ�..!

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

			String dbid = "hr";
			String dbpw = "hr";

			conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "";

			if (choice.equals("1")) {

				sql = "update jdbc_member set pw=? where id=?";

			} else if (choice.equals("2")) {

				sql = "update jdbc_member set nick=? where id=?";

			}

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, data);
			psmt.setString(2, id);

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("��������");
			} else {
				System.out.println("��������");
			}

			psmt.close();
			conn.close();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				psmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}

}
