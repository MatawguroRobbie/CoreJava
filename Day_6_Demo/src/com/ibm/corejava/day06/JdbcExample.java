package com.ibm.corejava.day06;

//STEP 1. Import required packages
import java.sql.*;

public class JdbcExample {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.hsqldb.jdbcDriver";
	static final String DB_URL = "jdbc:hsqldb:file:EMP";

	// Database credentials
	static final String USER = "username";
	static final String PASS = "password";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Create table
			System.out.println("Creating table in given database...");
			stmt = conn.createStatement();

			String sql = "CREATE TABLE EMPLOYEES " + "(id INTEGER not NULL, " + " first VARCHAR(255), "
					+ " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))";

			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");

			// STEP 5: Insert records
			System.out.println("Inserting records into the table...");
			stmt = conn.createStatement();

			sql = "INSERT INTO Employees " + "VALUES (100, 'Zara', 'Ali', 18)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO Employees " + "VALUES (101, 'Mahnaz', 'Fatma', 25)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO Employees " + "VALUES (102, 'Zaid', 'Khan', 30)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO Employees " + "VALUES(103, 'Sumit', 'Mittal', 28)";
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table...");

			// STEP 6: Query the database
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			sql = "SELECT id, first, last, age FROM Employees";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 7: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("first");
				String last = rs.getString("last");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(", Age: " + age);
				System.out.print(", First: " + first);
				System.out.println(", Last: " + last);
			}

			// STEP 8: Delete records
			System.out.println("Removing records from the table...");
			stmt = conn.createStatement();

			sql = "DELETE FROM Employees " + "WHERE id = 100";
			stmt.executeUpdate(sql);
			sql = "DELETE FROM Employees " + "WHERE last = 'Khan'";
			stmt.executeUpdate(sql);
			System.out.println("Removed records from the table...");

			// STEP 9: Query database again to view changes
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			sql = "SELECT id, first, last, age FROM Employees";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String first = rs.getString("first");
				String last = rs.getString("last");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(", Age: " + age);
				System.out.print(", First: " + first);
				System.out.println(", Last: " + last);
			}

			// Step 10:
			System.out.println("Removing table in given database...");
			stmt = conn.createStatement();
			sql = "DROP TABLE EMPLOYEES";
			stmt.executeUpdate(sql);
			System.out.println("Removed table in given database...");

			// STEP 11: Close resources
			rs.close();
//			stmt.close();
//			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main
}// end FirstExample