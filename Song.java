/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Song
{
  private String title;
  //only mutated by value
  private int rating;
 
  /*** Constructor ****/
  public Song(String t, int r)
  {
    title = t;
    rating = r;
  }


 
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }




 
  public int getRating() {
    return rating;
  }
 
 
  public String toString()
  {
    String info = "\"" + title + "\"";
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


  public void setRating(int r) {
    rating = r;
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
  }


  public boolean equals(Song otherSong) {
    if (this.title.equals(otherSong.title) && this.rating == otherSong.rating) {
      return true;
    } else{
      return false;
    }
  }
}


