package Movie_Rental_Tests;

import Movie_Rental.Movie;
import Movie_Rental.Buyer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuyerTest {
    @Test

    public void rentMovieTest(){

        Buyer buyer = new Buyer("Sam", "Smith");
        Movie avengers = new Movie("Avengers", 4, 5.99);
        Movie starWars = new Movie("Star Wars", 6, 5.99);
        buyer.rentMovie(avengers);
        Assertions.assertTrue(buyer.getBorrowedMovies().contains(avengers));

        buyer.rentMovie(starWars);
        Assertions.assertTrue(buyer.getBorrowedMovies().contains(starWars));
    }

}
