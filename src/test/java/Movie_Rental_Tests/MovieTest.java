package Movie_Rental_Tests;

import Movie_Rental.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test

    public void borrowMovieTest(){

        Movie movie = new Movie("Bob", 6,10.99);

        Assertions.assertNotNull(movie);

        while(movie.getAmountBorrowed() != movie.getAvailableCopies()){
            Assertions.assertTrue(movie.borrowMovie());
        }


        Assertions.assertFalse(movie.borrowMovie());

    }

    }

