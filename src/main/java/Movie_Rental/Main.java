// A program to Allow a user to rent a movie
// Written on oct 2, 2024
// Auther: Luke Peddle

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
    public static void displayBuyerRentedMovies(){
        System.out.println("These are the movies you are currently renting");
        System.out.println();

        for(Movie movie: buyer.getBorrowedMovies()){
            System.out.println(movie.getTitle());
            System.out.println();

        }
    }

    public static void returnRentedMovie(){
        boolean exitReturnMenu = false;
        String movieTitle = "";
        Movie returnMovie = new Movie();

        if(buyer.getBorrowedMovies().size() == 0){
            System.out.println("You do not have any rented movies");
        }
        else {

            while (!exitReturnMenu) {
                displayBuyerRentedMovies();
                System.out.println("Enter the title of the movie you wish to return or enter 1 to exit");
                movieTitle = input.nextLine();

                if (movieTitle.equals("1")) {
                    exitReturnMenu = true;
                } else {
                    for (Movie movie : buyer.getBorrowedMovies()) {
                        if (movie.getTitle().equals(movieTitle)) {
                            //Save the movie to be returned
                            returnMovie = movie;
                        }
                    }

                    if (returnMovie != null) {
                        buyer.returnRentedMovie(returnMovie);
                        exitReturnMenu = true;

                    } else {
                        System.out.println("Movie does not exist inside database");
                    }
                }


            }
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
            System.out.println("Please enter an option\n1. Rent a Movie\n2. Return a Movie\n3. See movies you are currently renting\n4.Exit");
            option = input.next();

            switch(option){
                case "1":

                    RentAMovie();
                    break;
                case "2":
                    returnRentedMovie();
                    break;
                case "3":
                    displayBuyerRentedMovies();
                    break;
                case "4":
                    System.out.println("Thank you for using this program");
                    endProgram = true;
                    break;
                default:
                System.out.println("Invalid input- Please re-enter");
            }

        }
    }
}
