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
        Assertions.assertTrue(movie.borrowMovie(company));
        Assertions.assertEquals(1,movie.getAmountBorrowed());
        int amountBorrowed = movie.getAmountBorrowed();

        while(movie.getAmountBorrowed() != movie.getAvailableCopies()){
            Assertions.assertTrue(movie.borrowMovie(company));
            amountBorrowed++;
            Assertions.assertEquals(amountBorrowed,movie.getAmountBorrowed());
        }


        Assertions.assertFalse(movie.borrowMovie(company));
        Assertions.assertEquals(movie.getAvailableCopies(),movie.getAmountBorrowed());


    }

    }

