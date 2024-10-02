package Movie_Rental_Tests;

import Movie_Rental.Movie;
import Movie_Rental.Buyer;
import Movie_Rental.RentalCompany;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuyerTest {
    @Test

    public void testRentMovie(){

        RentalCompany company = new RentalCompany("BlockBuster");
        Buyer buyer = new Buyer("Sam", "Smith");
        Movie avengers = new Movie("Avengers", 4, 5.99);
        Movie starWars = new Movie("Star Wars", 6, 5.99);
        buyer.rentMovie(avengers, company);
        Assertions.assertNotNull(buyer.getBorrowedMovies());
        Assertions.assertTrue(buyer.getBorrowedMovies().contains(avengers));


        //Test to see if the user can rent two of the same copy of movies
        int movieCounter = 0;
        buyer.rentMovie(starWars, company);
         for(Movie movie:buyer.getBorrowedMovies()){
            if(movie.getTitle().equals("Star Wars")){
                movieCounter++;
            }
        }

        Assertions.assertFalse(movieCounter == 2);
    }

    @Test
    public void testReturnRentedMovie() {
        RentalCompany company = new RentalCompany("BlockBuster");
        Buyer buyer = new Buyer("Sam", "Smith");
        Movie avengers = new Movie("Avengers", 4, 5.99);
        Movie starWars = new Movie("Star Wars", 6, 5.99);

         buyer.rentMovie(avengers, company);

         buyer.rentMovie(starWars, company);

         buyer.returnRentedMovie(avengers);
         Assertions.assertNotNull(buyer.getBorrowedMovies());
         Assertions.assertFalse(buyer.getBorrowedMovies().contains(avengers));
    }
}
