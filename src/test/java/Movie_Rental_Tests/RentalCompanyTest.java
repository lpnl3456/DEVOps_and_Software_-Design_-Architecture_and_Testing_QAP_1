package Movie_Rental_Tests;
import Movie_Rental.Movie;
import Movie_Rental.Buyer;
import Movie_Rental.RentalCompany;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RentalCompanyTest {
    @Test

    public void testIncreaseEquity(){
        RentalCompany company = new RentalCompany("BlockBuster");
        Buyer buyer = new Buyer("Sam", "Smith");
        Movie avengers = new Movie("Avengers", 4, 5.99);

        double moviePrice = avengers.getPrice();

        Assertions.assertEquals(0, company.getEquity());
        buyer.rentMovie(avengers, company);

        Assertions.assertEquals((0+moviePrice), company.getEquity());

    }

    @Test
    public void testNameNotNull(){
        RentalCompany company = new RentalCompany("BlockBuster");

        Assertions.assertNotNull(company.getName());

    }
}
