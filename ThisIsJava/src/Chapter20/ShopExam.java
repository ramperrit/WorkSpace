package Chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ShopExam {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb",
											   "Java",
											   "1234"
											   );
			System.out.println("연결 성공");
			Scanner scan = new Scanner(System.in);
			System.out.println("키를 입력하세요> ");
			int heights = scan.nextInt();
			
			String sql = "select * from buytbl where userid = any(select userid from usertbl wherer height =?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,heights);
			
			ResultSet rs = pstmt.executeQuery();
			
			System.out.println("키가 " + heights +"인 모든 이용자의 구매 목록");
//			while(rs.next()) {
//			} else {
//				System.out.println("사용자 아이디가 존재하지 않음");
//			}
			rs.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch (SQLException e) {}
			}
		}
	}

}
