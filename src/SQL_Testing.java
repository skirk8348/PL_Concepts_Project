import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQL_Testing
{
	public static void main(String[] args)
		{
		Sql_Extraction mySqlManager = new Sql_Extraction();

		ResultSet theRs = mySqlManager.createAResultSet(mySqlManager.createAStatement(mySqlManager.createAConnection()));

		ArrayList<MovieObject> movieObjectList = new ArrayList<MovieObject>();
		try
		{
			while (theRs.next())
			{
				//Maybe, instead of having a syso.println with all attributes, try syso.print for each value and have a /n for the last attribute for each movie
				MovieObject myMovieobj = new MovieObject(theRs.getString("Title"), theRs.getString("Genre"), theRs.getString("Director"), theRs.getInt("ReleaseYear"), theRs.getInt("MovieID"), theRs.getString("Description"));
				movieObjectList.add(myMovieobj);
//			System.out.println(theRs.getString("Title") + ", " + theRs.getString("Genre") + ", " + theRs.getString("Director") + ", " + theRs.getString("Description"));}
//			int newMovieID = theRs.getInt("MovieID");
//			int newReleaseYear = theRs.getInt("ReleaseYear");
//			System.out.println(theRs.getInt("MovieID"));
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}

		for (int i = 0; i <= 35; i++)
		{
			System.out.println(movieObjectList.get(i).getTitle() + ", " + movieObjectList.get(i).getGenre() + ", " + movieObjectList.get(i).getDirector() + ", " + movieObjectList.get(i).getReleaseYear() + ", " + movieObjectList.get(i).getMovieID() + ", " + movieObjectList.get(i).getDescription() + ", " + "\n");

		}


		}
}
//				System.out.print(theRs.getString("Title"));
//				System.out.print(", ");
//				System.out.print(theRs.getString("Genre"));
//				System.out.print(", ");
//				System.out.print(theRs.getString("Director"));
//				System.out.print(", ");
//				System.out.print(theRs.getInt("ReleaseYear"));
//				System.out.print(", ");
//				System.out.print(theRs.getInt("MovieID"));
//				System.out.print(", ");
//				System.out.print(theRs.getString("Description") + "\n");