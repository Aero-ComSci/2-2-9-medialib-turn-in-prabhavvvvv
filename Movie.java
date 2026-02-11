/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Movie
{
  private String title;
  private double duration;
  //only mutated by value
  private int rating;
 
  /*** Constructor ****/
  public Movie(String t, double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }


 
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }


  public double getDuration() {
    return duration;
  }
 
  public int getRating() {
    return rating;
  }
 
 
  public String toString()
  {
    String info = "\"" + title + "\", duration: " + duration + " hours";
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


  public void setDuration(double d) {
    duration = d;
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


  public boolean equals(Movie otherMovie) {
    if (this.title.equals(otherMovie.title) && this.duration == otherMovie.duration) {
      return true;
    } else{
      return false;
    }
  }
}


