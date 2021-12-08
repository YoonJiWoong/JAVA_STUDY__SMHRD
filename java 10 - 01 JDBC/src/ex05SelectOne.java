import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ex05SelectOne {

	public static void main(String[] args) {
		// 특정 회원의 ID입력하면 -> 해당 ID를 가진 회원의 정보만 출력
		// ID는 겹치지 않는다! 라는 가정

		Scanner sc = new Scanner(System.in);
		System.out.println("== 특정 회원정보 출력 ==");
		System.out.print("id 입력 : ");
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

			String sql = "select * from jdbc_member where id=?"; // ; 없이 작성

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inputid); //index는 1부터 시작 / 정수형이면 setIndex

			rs = psmt.executeQuery(); // 임폴트

			while (rs.next()) { // rs.next 자체가 true 나 false
				
				// 1==1 ->  true , rs.next()=true 이렇게 써도 되긴되는데 안써도되
				
				// 각각의 컬럼값 읽어오기
				String id = rs.getString(1); // 컬럼은 순서(1부터 시작) 지정 / 첫번째 가져오겠다. 여기선 id
				String pw = rs.getString(2); // 컬럼 이름(String)지정해서 가지고 오기
				String nick = rs.getString(3);
				// rs.getDate() 날짜일때는
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
