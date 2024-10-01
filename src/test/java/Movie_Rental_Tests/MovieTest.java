package Movie_Rental_Tests;

import Movie_Rental.Movie;
import Movie_Rental.RentalCompany;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test

    public void borrowMovieTest(){

        RentalCompany company = new RentalCompany("BlockBuster");
        Movie movie = new Movie("Bob", 6,10.99);

        Assertions.assertNotNull(movie);

        while(movie.getAmountBorrowed() != movie.getAvailableCopies()){
            Assertions.assertTrue(movie.borrowMovie(company));
        }


        Assertions.assertFalse(movie.borrowMovie(company));

    }

    }

