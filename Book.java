/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String title;
  private String author;
  //only mutated by value
  private int rating;
 
  /*** Constructor ****/
  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
  }


 
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }


  public String getAuthor() {
    return author;
  }
 
  public int getRating() {
    return rating;
  }
 
 
  public String toString()
  {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0)
    {
      info += ", rating is " + rating;
    }
    return info;
  }






  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }


  public void setAuthor(String a) {
    author = a;
  }


  /**
   * Set rating
   * @param int rating: between 1 and 10
   * only changes when rating is 0-10
   * postcondition: rating attribute will be an integer between 0-10
   * precondition: object cannot be null
   */


  public void adjustRating(int r) {
    if (r >=0 && r <=10) {
      rating = r;
    }
    System.out.println("Adjusting rating by " + r);
  }


  public boolean equals(Book otherBook) {
    if (this.title.equals(otherBook.title) && this.author.equals(otherBook.author)) {
      return true;
    } else {
      return false;
    }
  }
}
