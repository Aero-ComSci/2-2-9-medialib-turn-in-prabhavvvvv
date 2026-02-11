/*
 * Activity 2.2.9
 */
public class MediaLib
{
  public static String owner = "Prabhav Yeddanapudi";
  
  private static int NumEntries;
  private static int NumBooks;
  private static int NumMovies;
  private static int NumSongs;
  private String lastModified;
  
  private Book book;
  private Movie movie;
  private Song song;
  
  public MediaLib() {
    lastModified = DateTime.getTime();
  }
  
  public void addBook(Book b)
  {
    if (book == null)
    {
      book = b;
      NumEntries++;
      NumBooks++;
      lastModified = DateTime.getTime();
    } 
    else
      System.out.println("Cannot add a new book: A book already exists");
  }
  
  public void addMovie(Movie m)
  {
    if (movie == null)
    {
      movie = m;
      NumEntries++;
      NumMovies++;
      lastModified = DateTime.getTime();
    }
    else
      System.out.println("Cannot add a new movie: A movie already exists");
  }
  
  public void addSong(Song s)
  {
    if (song == null)
    {
      song = s;
      NumEntries++;
      NumSongs++;
      lastModified = DateTime.getTime();
    }
    else
      System.out.println("Cannot add a new song: A song already exists");
  }

  public static String getOwner()
  {
    return owner;
  }

  public static void changeOwner(String o)
  {
    owner = o;
  }
  
  public static int getNumEntries()
  {
    return NumEntries;
  }
  
  public static int getNumBooks()
  {
    return NumBooks;
  }
  
  public static int getNumMovies()
  {
    return NumMovies;
  }
  
  public static int getNumSongs()
  {
    return NumSongs;
  }
  
  public String toString() 
  {
    String info = "";
    
    if (book != null)
      info += "Book: " + book + "\n";
    if (movie != null)
      info += "Movie: " + movie + "\n";
    if (song != null)
      info += "Song: " + song + "\n";

    info += "Last Modified: " + lastModified + "\n";
 
    return info;
  }
}
