public class MovieObject
{
	private String title;
	private String genre;
	private String director;
	private int releaseYear;
	private int movieID;
	private String description;

	public MovieObject(String title, String genre, String director, int releaseYear, int movieID, String description)
		{
		this.title = title;
		this.genre = genre;
		this.director = director;
		this.releaseYear = releaseYear;
		this.movieID = movieID;
		this.description = description;
		}

	public String getTitle()
		{
		return title;
		}

	public void setTitle(String title)
		{
		this.title = title;
		}

	public String getGenre()
		{
		return genre;
		}

	public void setGenre(String genre)
		{
		this.genre = genre;
		}

	public String getDirector()
		{
		return director;
		}

	public void setDirector(String director)
		{
		this.director = director;
		}

	public int getReleaseYear()
		{
		return releaseYear;
		}

	public void setReleaseYear(int releaseYear)
		{
		this.releaseYear = releaseYear;
		}

	public int getMovieID()
		{
		return movieID;
		}

	public void setMovieID(int movieID)
		{
		this.movieID = movieID;
		}

	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}
}
