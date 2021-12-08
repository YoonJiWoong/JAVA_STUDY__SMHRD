package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	//DAO : Data Access Object(
	//CRUD : INSERT, UPDATE, DELETE, SELECT �۾�����
	//Database ����
	//������� (����� View���� ȣ���ؼ� ���)
	
	//1.ȸ������
	public int insert(String id, String pw, String nick) {

		Connection conn=null;
		PreparedStatement psmt=null;
		int cnt=0;
		// Java���� �߻��ϴ� ���� 2����
		// 1. ������ ���� : �������� ����(�Ұ���,�߰��ΰ���...)
		// 2. ������ ���� : �����ؾ����� �� �� �ִ� ����(DB, ��Ʈ��ũ)
		
		// ����ó���� try~catch��
		// 
		try {
			// �������
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ��ҹ��� ����, ��Ÿ ����
			System.out.println("Class���� Ȯ��");
			
			//3. oracle �� ���� DB���̵�� PW�� ����(oracle�ּ�,id,pw)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; //����Ŭ �ּ�
			
			String dbid ="hr"; // ID
			String dbpw ="hr"; // PW
			
			// Connection ��ü ���� : Java���� oracle�� �ڵ鸵 �� �� �ִ� ��ü
			
			conn= DriverManager.getConnection(url,dbid,dbpw);
			
			if(conn!=null) {
				System.out.println("���� ����");
			}else {
				System.out.println("�������");
			}
			// �ڵ� ������ �����ʿ��� �������� �Է�
			
			// 4. oracle��  ����� SQL�� �غ�
			String sql="insert into jdbc_member values(?,?,?)";
			psmt= conn.prepareStatement(sql); // sql�� ���� �ִ��� �˷���
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			
			// 5. SQL ��� ����
			cnt = psmt.executeUpdate(); // db�μ�Ʈ �...
			
			
			
			// 7. �������� - ��ġ �� ����!!!
			psmt.close(); // PreparedStatement psmt=null �Ʒ� ����
			conn.close(); //try �� �ƿ� �ִ� ���� �����̴ϱ� ������ Connection conn=null �̶�� ����
			
			
		} catch (Exception e) {
			// �����߻�
			e.printStackTrace();// � ������ �߻��ߴ��� ���
			System.out.println("Class���� Ȯ�ν���");
		} finally {
		// ���������� ����Ǵ�, ������ ���� ���������� ����Ǵ� �κ�!	
		
		// 7. �������� - ��ġ �� ����!!!
		// ���� ��������!!
			
		//������ -> DB ������ �غ��� �� �� �ִ� ���� : ��Ÿ�� ����!! 	
		
		try {
			psmt.close();
			conn.close(); // ������ �����̴ϱ� try������... �ֳ��鵵 ������Ѻ��� �ȴ�.
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
			
		}
		return cnt;
	}

	public ArrayList<ModelVO> selectAll() {

		
		// ���� ���ԵǾ� �ִ� ��� ȸ���� ���� ��� (�ܼ�)
		// JDBC_member ���̺� ��� ���� ��� ->����x
		
		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;
		
		ArrayList<ModelVO> al =new ArrayList<ModelVO>();
		
		// try-catch : ����ó��(��Ÿ�� ����)
		try {
			// ������ �ڵ�
			// 1. ����̹� �ε� -> ClassNotFoundException
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			// �ٸ� ���� �����Ҷ���... / ��Ʈ��ȣ / 
			String dbid = "hr"; // id
			String dbpw = "hr"; // pw

			// 2. ������ ���̽� ���� (Connection)��ü ����
			 conn= DriverManager.getConnection(url,dbid,dbpw);
			
			
			String sql = "select * from jdbc_member"; // ; ���� �ۼ�
			// 3. sql ���� /�غ�(PreparedStatement)  ��ü ����
			psmt=conn.prepareStatement(sql);
			

			rs = psmt.executeQuery(); //����Ʈ
			
			while(rs.next()) { // rs.next ��ü�� true �� false
				// ������ �÷��� �о����
				String id = rs.getString(1); // �÷��� ����(1���� ����) ���� / ù��° �������ڴ�. ���⼱ id
				String pw =rs.getString("pw"); // �÷� �̸�(String)�����ؼ� ������ ����
				String nick =rs.getString(3);
				
				// int a = rs.getInt(1) -> �������� ������ �ö�
				// select nick �̶�� �ϸ� �г��� �����͵� rs.getString(1) ���
				
				ModelVO vo = new ModelVO(id, pw, nick);
				al.add(vo);
				
			}
			
			
		} catch (Exception e) {
			// try �� �ȿ��� �߻��� ���� ��Ȳ�� ���� ó��
			e.printStackTrace();
		} finally {
			// try ���ȿ��� �߻��� ���� ��Ȳ�� ���� ó��
			// ������ ���� �ݴ�� �ݾ����
			// 6. ����� ��ü �ݱ� (�ڿ���ȯ)
			try {
				
				// ������ �������� ��!!
				rs.close(); // ��ü������ ���� ���� ��� -> ���ʿ��� ���ܻ�Ȳ �߻� 
							// -> close() ȣ��x -> ��Ÿ�� ����
				psmt.close();
				conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		// ���� Ŀ�Եȴ�! db���� Ŀ�Դ�����!!
		
		
		return al;
		
	
	}
	
	
}
