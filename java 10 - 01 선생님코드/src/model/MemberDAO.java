package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	// DAO : Data Access Object (
	// CRUD : INSERT, UPDATE, DELETE , SELECT 작업 수행
	// Database 연결
	// 기능 정의 (기능은 View에서 호출해서 사용)
	ResultSet rs = null;
	PreparedStatement psmt = null;
	Connection conn = null;
	
	// 데이터 베이스 연결 메서드
	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class파일확인");
			
			// 3.oracle에 가서 DB아이디와 PW를 인증(oracle주소, id, pw)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			// Connection객체 리턴 : Java에서 oracle을 핸들링 할 수 있는 객체
			conn = DriverManager.getConnection(url, dbid, dbpw);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	// 객체 닫는 메소드 (사용한 자원 반환)
	public void close() {

		// try 안에서 예외상황이 발생하던지 발생하지 않던지 무조건 실행하는 구문
		// 6. 사용한 객체 닫기 (자원반환)
		try {
			if(rs != null) {
				rs.close(); // 객체 생성이 되지 않은 경우 -> 위쪽에서 예외상황 발생 -> close() 호출x -> 런타임 오류
			}
			
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	
	// 1. 회원가입
	public int insert(ModelVO vo) {
		
		int cnt = 0;
		// Java에서 발생하는 오류 2가지
		// 1. 컴파일오류 : 문법적인오류
		// 2. 런타임오류 : 실행해야지만 알 수 있는 오류(DB, 네트워크)
		// 예외처리문 try~catch문
		try {
			// 정상실행
			conn();

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}

			// 4. oracle에 명령할 SQL문 준비
			String sql = "insert into JDBC_member values(?, ?, ?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getNick());

			// 5 SQL명령 실행
			cnt = psmt.executeUpdate();

		} catch (Exception e) {
			// 오류발생
			e.printStackTrace();// 어떤 오류가 발생했는지 출력
			System.out.println("Class파일확인실패");
		} finally {
			close();
		}
		return cnt;
	}

	// 4. 전체회원정보
	public ArrayList<ModelVO> selectAll() {
	

		ArrayList<ModelVO> al = new ArrayList<ModelVO>();

		// try~catch : 예외처리 (런타임오류)
		try {
			conn();

			//동일하니깐 try 에서 메소드로 할 수 있어!!
			
			
			String sql = "select * from jdbc_member";
			// 3. sql 실행/준비(PreparedStatement) 객체 생성
			psmt = conn.prepareStatement(sql);

			// executeUpdate() : insert, delete, update -> 테이블에 변화 O
			// -> 반환값 (INT) -> 몇개의 행에서 변화가 일어났는지
			// executeQuery() : select -> 테이블에 변화 x
			// -> 반환값 (ResultSet(Object)) -> select문 실행시 결과값 + 커서
			// next() : 커서를 한칸 움직임(다음 행을 가리킴)
			// -> 커서가 가리키는 행에 값이 있는지 없는지 판단 -> 있으면 true반환 없으면 false반환
			// 4. sql 문 실행
			rs = psmt.executeQuery();

			// 5. 값을 출력
			while (rs.next()) {
				// 각각의 컬럼값 읽어오기
				String id = rs.getString(1); // 컬럼의 순서(1부터 시작) -> (resultset 상에 순서) 지정
				String pw = rs.getString("pw"); // 컬럼 이름(String) 지정
				String nick = rs.getString(3);
				// int a = rs.getInt(1) -> 정수형값 가지고 올때

				// 한 회원에 대한 정보 묶기
				ModelVO vo = new ModelVO(id, pw, nick);

				al.add(vo);

			}

		} catch (Exception e) {
			// try 문안에서 발생한 예외 상황에 대한 처리
			e.printStackTrace();
		} finally {
			close();
		}
		return al;
	}

	// 5. 특정 회원 정보
	public ModelVO selectOne(String id) {

		

		ModelVO vo = null;

		try {
			conn();

			String sql = "select * from jdbc_member where id=?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();

			while (rs.next()) {

				String getid = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);

				vo = new ModelVO(getid, pw, nick);
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return vo;

	}
	
	
	// 2. 회원정보 수정
	
	public int update(String id, String choice, String data) {
		
		int cnt=0;
		 	

		try {
			conn();

			String sql = "";

			if (choice.equals("1")) {

				sql = "update jdbc_member set pw=? where id=?";

			} else if (choice.equals("2")) {

				sql = "update jdbc_member set nick=? where id=?";

			}

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, data);
			psmt.setString(2, id);

			cnt = psmt.executeUpdate();

			
		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			close();
		}

	
		return cnt;
		
		
		
	}
	
	
	public int delete(String id) {
		int cnt=0;
		try {
			conn();

			String sql = "delete from JDBC_member where id=?";
			psmt = conn.prepareStatement(sql); 
			psmt.setString(1, id);
			

			cnt = psmt.executeUpdate(); 

			
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

		return cnt;
	}
	
	
}
