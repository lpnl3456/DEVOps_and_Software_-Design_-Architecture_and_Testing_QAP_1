package Movie_Rental;
import java.util.ArrayList;

public class Buyer {
    private String firstName;
    private String lastName;
    private ArrayList<Movie> borrowedMovies = new ArrayList<Movie>();

    public Buyer (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ArrayList<Movie> getBorrowedMovies() {
        return borrowedMovies;
    }

    public void setBorrowedMovies(ArrayList<Movie> borrowedMovies) {
        this.borrowedMovies = borrowedMovies;
    }

    public void rentMovie(Movie movie, RentalCompany company){

        if(borrowedMovies.contains(movie)){
            System.out.println("You have already borrowed this movie");
        }

        else{
           if(movie.borrowMovie(company)) {
               borrowedMovies.add(movie);
               System.out.println("You have now rented " + movie.getTitle());
           }
        }
    }

    public void returnRentedMovie(Movie movie){

        if(borrowedMovies.contains(movie)){
            movie.returnMovie();
            borrowedMovies.remove(movie);
        }
        else{
            System.out.println(firstName + " " + lastName + " has not rented this movie");
        }
    }
}
