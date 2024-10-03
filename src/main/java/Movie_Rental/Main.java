package Movie_Rental;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   static RentalCompany company = new RentalCompany("BlockBuster");
   static Buyer buyer = new Buyer("Sam", "Smith");
    static Movie avengers = new Movie("Avengers", 4, 5.99);
    static Movie starWars = new Movie("Star Wars", 6, 5.99);
    static Movie transformers = new Movie("Transformers", 3, 5.99);
    static  Movie planetApes = new Movie("Planet of the Apes", 5, 5.99);
    static Movie captainAmericaWS = new Movie("Captain America Winter Solider", 5, 5.99);

    static ArrayList<Movie>companyMovieList = new ArrayList<Movie>();
    static Scanner input = new Scanner(System.in);

    public static void RentAMovie(){
        boolean exitRentMenu = false;
        String movieTitle = "";


        while(!exitRentMenu){
            displayCompanyMovies();

            System.out.println("Enter the title of the movie you wish to rent or enter 1 to exit");
            movieTitle = input.nextLine();

            if(movieTitle.equals("1")){
                exitRentMenu = true;
            }

            else{
                for(Movie movie: companyMovieList){
                    if(movie.getTitle().equals(movieTitle)){
                        buyer.rentMovie(movie, company);
                        exitRentMenu = true;
                    }
                }
            }

        }
    }

    public static void displayCompanyMovies(){
        for(Movie movie: companyMovieList){
            System.out.println(movie.getTitle());
            System.out.println("Price: $" + movie.getPrice() + "   Current copies available: " + (movie.getAvailableCopies()-movie.getAmountBorrowed()));
            System.out.println();
        }
    }


    public static void main(String[] args) {
        companyMovieList.add(avengers);
        companyMovieList.add(starWars);
        companyMovieList.add(transformers);
        companyMovieList.add(planetApes);
        companyMovieList.add(captainAmericaWS);

        boolean endProgram = false;
        String option = "";
        Scanner input = new Scanner(System.in);

        while(!endProgram){
            System.out.println("Hello " + buyer.getFirstName() + " welcome to " + company.getName());
            System.out.println("Please enter an option\n1. Rent a Movie\n2. Return a Movie\n3. Exit");
            option = input.next();

            switch(option){

                case "1":
                    RentAMovie();
                    break;
                case "2":
                    System.out.println("Enter return option");
                    break;
                case "3":
                    System.out.println("Thank you for using this program");
                    endProgram = true;
                    break;
                default:
                System.out.println("Invalid input- Please re-enter");
            }

        }
    }
}
