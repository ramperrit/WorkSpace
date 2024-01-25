package Chapter20;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardInsertExam {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava",
											   "Java",
											   "1234"
											   );
			System.out.println("연결 성공");
			
			String sql = new StringBuilder()
					.append("INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata) ")
					.append("VALUES (?, ?, ?, now(), ?, ?)")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, "눈 오는 날");
			pstmt.setString(2, "함박눈이 내려요");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "a.jpg");
			pstmt.setBlob(5, new FileInputStream("src/Chapter20/img/a.png"));
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: "+rows);
			
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno:  "+ bno);
				}
				rs.close();
			}
		pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {}
			}
		}
		
		
	}

}
