package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	//DAO : Data Access Object(
	//CRUD : INSERT, UPDATE, DELETE, SELECT 작업수행
	//Database 연결
	//기능정의 (기능은 View에서 호출해서 사용)
	
	//1.회원가입
	public int insert(String id, String pw, String nick) {

		Connection conn=null;
		PreparedStatement psmt=null;
		int cnt=0;
		// Java에서 발생하는 오류 2가지
		// 1. 컴파일 오류 : 문법적인 오류(소가로,중가로같은...)
		// 2. 런파일 오류 : 실행해야지만 알 수 있는 오류(DB, 네트워크)
		
		// 예외처리문 try~catch문
		// 
		try {
			// 정상실행
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 대소문자 구분, 오타 주의
			System.out.println("Class파일 확인");
			
			//3. oracle 에 가서 DB아이디와 PW를 인증(oracle주소,id,pw)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; //오라클 주소
			
			String dbid ="hr"; // ID
			String dbpw ="hr"; // PW
			
			// Connection 객체 리던 : Java에서 oracle을 핸들링 할 수 있는 객체
			
			conn= DriverManager.getConnection(url,dbid,dbpw);
			
			if(conn!=null) {
				System.out.println("연결 성공");
			}else {
				System.out.println("연결실패");
			}
			// 코딩 읽을때 오른쪽에서 왼쪽으로 입력
			
			// 4. oracle에  명령할 SQL문 준비
			String sql="insert into jdbc_member values(?,?,?)";
			psmt= conn.prepareStatement(sql); // sql문 오류 있는지 알려줘
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			
			// 5. SQL 명령 실행
			cnt = psmt.executeUpdate(); // db인설트 몇개...
			
			
			
			// 7. 연결종료 - 위치 잘 적기!!!
			psmt.close(); // PreparedStatement psmt=null 아래 동일
			conn.close(); //try 문 아에 있는 전역 변수이니깐 위에다 Connection conn=null 이라고 써줘
			
			
		} catch (Exception e) {
			// 오류발생
			e.printStackTrace();// 어떤 오류가 발생했는지 출력
			System.out.println("Class파일 확인실패");
		} finally {
		// 정상적으로 실행되던, 오류가 났던 마지막으로 실행되는 부분!	
		
		// 7. 연결종료 - 위치 잘 적기!!!
		// 오류 지역변수!!
			
		//빨간줄 -> DB 실행을 해봐야 알 수 있는 오류 : 런타임 오류!! 	
		
		try {
			psmt.close();
			conn.close(); // 런파일 오류이니깐 try문으로... 애내들도 실행시켜봐야 안다.
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
			
		}
		return cnt;
	}

	public ArrayList<ModelVO> selectAll() {

		
		// 현재 가입되어 있는 모든 회원의 정보 출력 (콘솔)
		// JDBC_member 테이블에 모든 정보 출력 ->조건x
		
		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;
		
		ArrayList<ModelVO> al =new ArrayList<ModelVO>();
		
		// try-catch : 예외처리(런타임 오류)
		try {
			// 실행할 코드
			// 1. 드라이버 로드 -> ClassNotFoundException
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			// 다른 서버 수정할때는... / 포트번호 / 
			String dbid = "hr"; // id
			String dbpw = "hr"; // pw

			// 2. 데이터 베이스 연결 (Connection)객체 생성
			 conn= DriverManager.getConnection(url,dbid,dbpw);
			
			
			String sql = "select * from jdbc_member"; // ; 없이 작성
			// 3. sql 실행 /준비(PreparedStatement)  객체 생성
			psmt=conn.prepareStatement(sql);
			

			rs = psmt.executeQuery(); //임폴트
			
			while(rs.next()) { // rs.next 자체가 true 나 false
				// 각각의 컬럼값 읽어오기
				String id = rs.getString(1); // 컬럼은 순서(1부터 시작) 지정 / 첫번째 가져오겠다. 여기선 id
				String pw =rs.getString("pw"); // 컬럼 이름(String)지정해서 가지고 오기
				String nick =rs.getString(3);
				
				// int a = rs.getInt(1) -> 정수형값 가지고 올때
				// select nick 이라고 하면 닉네임 가져와도 rs.getString(1) 써야
				
				ModelVO vo = new ModelVO(id, pw, nick);
				al.add(vo);
				
			}
			
			
		} catch (Exception e) {
			// try 문 안에서 발생한 예외 상황에 대한 처리
			e.printStackTrace();
		} finally {
			// try 문안에서 발생한 예외 상황에 대한 처리
			// 생성한 순서 반대로 닫아줘야
			// 6. 사용한 객체 닫기 (자원반환)
			try {
				
				// 생성한 역순으로 꼭!!
				rs.close(); // 객체생성이 되지 않은 경우 -> 위쪽에서 예외상황 발생 
							// -> close() 호출x -> 런타임 오류
				psmt.close();
				conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		// 오토 커밋된다! db에서 커밋누르고!!
		
		
		return al;
		
	
	}
	
	
}
