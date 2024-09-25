package Movie_Rental_Tests;

import Movie_Rental.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test

    public void borrowMovieTest(){

        Movie movie = new Movie("Bob", 1,10.99);

        Assertions.assertTrue(movie.borrowMovie());

        Assertions.assertFalse(movie.borrowMovie());

    }

    }

