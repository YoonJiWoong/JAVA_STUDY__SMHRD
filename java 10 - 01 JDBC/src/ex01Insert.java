import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex01Insert {

	public static void main(String[] args) {
		
		System.out.println("회원 가입 서비스");
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("NICK : ");
		String nick = sc.next();
		
		
		
		//JDBC(Java DataBase Connectivity)
		//Java와 DataBase를 연결해주는 API(Interface)
		
		
		//연결순서
		//1. oracle에서 제공하는 Java와 연결 할 수 있는 외부.jar 가져와야함.
		
		//2. ojdbc6.jar 에서 연결하는 기능을 담당하는 드라이버. class파일 동적로딩
		
		Connection conn=null;
		PreparedStatement psmt=null;
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
			int cnt = psmt.executeUpdate(); // db인설트 몇개...
			
			// 6. 명령 후 처리
			if(cnt>0) {
				System.out.println("입력성공");
			}else {
				System.out.println("입력실패");
			}
			
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
		
		
		///////
	}

	
}
