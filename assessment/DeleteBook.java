package assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteBook {
	static void book() throws SQLException {
		Connection con = null;
		Scanner kb = null;

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/josh", "postgres", "123456");
			System.out.println("delete according to \n 1.Book Number \n 2.Book Name \n 3.Author Name \n 4.Language :");
			int n = kb.nextInt();
			switch (n) {
			case 1:
				System.out.println("Enter book name: ");
				String s=kb.next();
				PreparedStatement pstmt = con.prepareStatement("delete column from Books where BookName="+s);
				break;
			case 2:
				System.out.println("Enter book number: ");
				int k=kb.nextInt();
				PreparedStatement pstmt1 = con.prepareStatement("delete column from Books where BookNumber="+k);
				break;
			case 3:
				System.out.println("Enter author name: ");
				String s1=kb.next();
				PreparedStatement pstmt2 = con.prepareStatement("delete column from Books where Author="+s1);
				break;
			case 4:
				System.out.println("Enter language: ");
				String s3=kb.next();
				PreparedStatement pstmt3 = con.prepareStatement("delete column from Books where language="+s3);
				break;

			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			con.close();
			kb.close();
		}

	}

}
