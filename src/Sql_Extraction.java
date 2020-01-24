import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sql_Extraction
{
	Connection myConn;
	Statement myStmt;
	ResultSet myRs;

	//need method for establishing connection
	public Connection createAConnection()
		{
		try
		{
			this.myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/plc_project", "root", "43268790b");
		} catch (java.sql.SQLException e)
		{
			e.printStackTrace();
		}
		return myConn;
		}

	public Statement createAStatement(Connection x)
		{
		try
		{
			this.myStmt = x.createStatement();

		} catch (java.sql.SQLException e)
		{
			e.printStackTrace();
		}
		return myStmt;
		}

	public ResultSet createAResultSet(Statement x)
		{
		try
		{
			this.myRs = x.executeQuery("Select * From Movies");
		} catch (java.sql.SQLException e)
		{
			e.printStackTrace();
		}
		return myRs;
		}

	//will want method to return MovieID and release year
//	public int getMovieID(){
//      try {
//          this.
//      }
//	}
}





