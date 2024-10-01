package Movie_Rental_Tests;

import Movie_Rental.Movie;
import Movie_Rental.Buyer;
import Movie_Rental.RentalCompany;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuyerTest {
    @Test

    public void rentMovieTest(){

        RentalCompany company = new RentalCompany("BlockBuster");
        Buyer buyer = new Buyer("Sam", "Smith");
        Movie avengers = new Movie("Avengers", 4, 5.99);
        Movie starWars = new Movie("Star Wars", 6, 5.99);
        buyer.rentMovie(avengers, company);
        Assertions.assertNotNull(buyer.getBorrowedMovies());
        Assertions.assertTrue(buyer.getBorrowedMovies().contains(avengers));

        buyer.rentMovie(starWars, company);
        Assertions.assertTrue(buyer.getBorrowedMovies().contains(starWars));
    }

    @Test
    public void returnRentedMovieTest() {
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
