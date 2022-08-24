package assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class InsertBook{
	static void book() throws SQLException {
		Connection con = null;
		Scanner kb = null;

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/josh", "postgres", "123456");

			//inserting book details into the database
			PreparedStatement pstmt = con.prepareStatement("insert into Books values(?,?,?,?)");

			kb = new Scanner(System.in);
			System.out.println("Enter BookNumber, BookName, BookAuthor, BookLanguage: ");
			long number=kb.nextLong();
			String name = kb.nextLine();
			String author = kb.next();
			String language=kb.next();
			pstmt.setLong(1, number);
			pstmt.setString(2, name);
			pstmt.setString(3, author);
			pstmt.setString(4, language);
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			con.close();
			kb.close();
		}
		
	}
}
