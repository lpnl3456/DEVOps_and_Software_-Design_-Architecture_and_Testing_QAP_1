package Movie_Rental;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RentalCompany company = new RentalCompany("BlockBuster");
        Buyer buyer = new Buyer("Sam", "Smith");
        Movie avengers = new Movie("Avengers", 4, 5.99);
        Movie starWars = new Movie("Star Wars", 6, 5.99);
        Movie Transformers = new Movie("Transformers", 3, 5.99);
        Movie planetApes = new Movie("Planet of the Apes", 5, 5.99);
        Movie captainAmericaWS = new Movie("Captain America Winter Solider", 5, 5.99);

        ArrayList<Movie>companyMovieList = new ArrayList<Movie>();

        companyMovieList.add(avengers);
        companyMovieList.add(starWars);
        companyMovieList.add(Transformers);
        companyMovieList.add(planetApes);
        companyMovieList.add(captainAmericaWS);

        boolean endProgram = false;
        String option = "";
        Scanner input = new Scanner(System.in);

        while(endProgram == false){
            System.out.println("Hello " + buyer.getFirstName() + " welcome to " + company.getName());
            System.out.println("Please enter an option\n1. Rent a Movie\n2. Return a Movie\n3. Exit");
            option = input.next();

            switch(option){

                case "1":
                    System.out.println("Enter rent option");
                    break;
                case "2":
                    System.out.println("Enter return option");
                    break;
                case "3":
                    System.out.println("Thank you for usinf this program");
                    endProgram = true;
                    break;
                default:
                System.out.println("Invalid input- Please re-enter");
            }

        }
    }
}
