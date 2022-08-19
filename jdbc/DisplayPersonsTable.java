// This class displays the values of Persons Table 

package training.jdbc;

import java.sql.*;

public class DisplayPersonsTable {

	public static void main(String[] args) throws SQLException {

		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/josh", "postgres", "123456");
			Statement stmt = con.createStatement();

			// stmt.executeQuery("insert into persons
			// values(1,'Bharat','Odisha','Berhampur')");
			// stmt.executeQuery("delete from persons WHERE personid=1;");

			ResultSet rs = stmt.executeQuery("select * from persons");
			while (rs.next())
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4));

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			con.close();
		}
	}

}
