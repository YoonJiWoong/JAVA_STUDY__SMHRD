package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	// DAO : Data Access Object (
	// CRUD : INSERT, UPDATE, DELETE , SELECT �۾� ����
	// Database ����
	// ��� ���� (����� View���� ȣ���ؼ� ���)
	ResultSet rs = null;
	PreparedStatement psmt = null;
	Connection conn = null;
	
	// ������ ���̽� ���� �޼���
	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class����Ȯ��");
			
			// 3.oracle�� ���� DB���̵�� PW�� ����(oracle�ּ�, id, pw)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			// Connection��ü ���� : Java���� oracle�� �ڵ鸵 �� �� �ִ� ��ü
			conn = DriverManager.getConnection(url, dbid, dbpw);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	// ��ü �ݴ� �޼ҵ� (����� �ڿ� ��ȯ)
	public void close() {

		// try �ȿ��� ���ܻ�Ȳ�� �߻��ϴ��� �߻����� �ʴ��� ������ �����ϴ� ����
		// 6. ����� ��ü �ݱ� (�ڿ���ȯ)
		try {
			if(rs != null) {
				rs.close(); // ��ü ������ ���� ���� ��� -> ���ʿ��� ���ܻ�Ȳ �߻� -> close() ȣ��x -> ��Ÿ�� ����
			}
			
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	
	// 1. ȸ������
	public int insert(ModelVO vo) {
		
		int cnt = 0;
		// Java���� �߻��ϴ� ���� 2����
		// 1. �����Ͽ��� : �������ο���
		// 2. ��Ÿ�ӿ��� : �����ؾ����� �� �� �ִ� ����(DB, ��Ʈ��ũ)
		// ����ó���� try~catch��
		try {
			// �������
			conn();

			if (conn != null) {
				System.out.println("���Ἲ��");
			} else {
				System.out.println("�������");
			}

			// 4. oracle�� ����� SQL�� �غ�
			String sql = "insert into JDBC_member values(?, ?, ?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getNick());

			// 5 SQL��� ����
			cnt = psmt.executeUpdate();

		} catch (Exception e) {
			// �����߻�
			e.printStackTrace();// � ������ �߻��ߴ��� ���
			System.out.println("Class����Ȯ�ν���");
		} finally {
			close();
		}
		return cnt;
	}

	// 4. ��üȸ������
	public ArrayList<ModelVO> selectAll() {
	

		ArrayList<ModelVO> al = new ArrayList<ModelVO>();

		// try~catch : ����ó�� (��Ÿ�ӿ���)
		try {
			conn();

			//�����ϴϱ� try ���� �޼ҵ�� �� �� �־�!!
			
			
			String sql = "select * from jdbc_member";
			// 3. sql ����/�غ�(PreparedStatement) ��ü ����
			psmt = conn.prepareStatement(sql);

			// executeUpdate() : insert, delete, update -> ���̺� ��ȭ O
			// -> ��ȯ�� (INT) -> ��� �࿡�� ��ȭ�� �Ͼ����
			// executeQuery() : select -> ���̺� ��ȭ x
			// -> ��ȯ�� (ResultSet(Object)) -> select�� ����� ����� + Ŀ��
			// next() : Ŀ���� ��ĭ ������(���� ���� ����Ŵ)
			// -> Ŀ���� ����Ű�� �࿡ ���� �ִ��� ������ �Ǵ� -> ������ true��ȯ ������ false��ȯ
			// 4. sql �� ����
			rs = psmt.executeQuery();

			// 5. ���� ���
			while (rs.next()) {
				// ������ �÷��� �о����
				String id = rs.getString(1); // �÷��� ����(1���� ����) -> (resultset �� ����) ����
				String pw = rs.getString("pw"); // �÷� �̸�(String) ����
				String nick = rs.getString(3);
				// int a = rs.getInt(1) -> �������� ������ �ö�

				// �� ȸ���� ���� ���� ����
				ModelVO vo = new ModelVO(id, pw, nick);

				al.add(vo);

			}

		} catch (Exception e) {
			// try ���ȿ��� �߻��� ���� ��Ȳ�� ���� ó��
			e.printStackTrace();
		} finally {
			close();
		}
		return al;
	}

	// 5. Ư�� ȸ�� ����
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
	
	
	// 2. ȸ������ ����
	
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
