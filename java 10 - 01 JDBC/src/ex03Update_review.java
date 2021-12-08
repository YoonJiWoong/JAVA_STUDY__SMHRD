import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03Update_review {

	public static void main(String[] args) {

		// 사용자에게 id와 pw값을 입력받고
		// 입력받은 id값의 pw를 변경하시오.

		System.out.println("회원 수정 서비스");
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("1.pw, 2.nick");
		String choice = sc.next();
		System.out.print("수정할 DATA");
		String data = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;

		try { // try 문 안에 if써도 된다..!

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
				System.out.println("수정성공");
			} else {
				System.out.println("수정실패");
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
