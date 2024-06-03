package max;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtility {
	private ConnectionUtility() {
	}

	private static Connection con;
	static {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnn() {
		return con;
	}

	public static void main(String[] args) {
		System.out.println(ConnectionUtility.getConnn());
	}
}
