// Dynamically adding values into Persons Table

package training.jdbc;

import java.sql.*;
import java.util.Scanner;

public class InsertPersonsTable {

	public static void main(String args[]) throws SQLException {

		Connection con = null;
		Scanner kb = null;

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/josh", "postgres", "123456");

			PreparedStatement pstmt = con.prepareStatement("insert into persons values(?,?,?,?)");

			kb = new Scanner(System.in);
			System.out.println("Enter id, name, Address, city :");
			int id = kb.nextInt();
			String name = kb.next();
			String address = kb.next();
			String city = kb.next();
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setString(4, city);

//        int ans=pstmt.executeUpdate();
//        System.out.println(ans);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			con.close();
			kb.close();
		}
	}
}
