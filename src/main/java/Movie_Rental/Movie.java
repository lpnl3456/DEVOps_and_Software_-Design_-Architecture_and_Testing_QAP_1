package Movie_Rental;

public class Movie {

    private String title;
    private int availableCopies;
    private double price;

    private int amountBorrowed = 0;


    public Movie(String title, int availableCopies, double price){
        this.title = title;
        this.availableCopies = availableCopies;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public int getAmountBorrowed() {
        return amountBorrowed;
    }

    public void setAmountBorrowed(int amountBorrowed) {
        this.amountBorrowed = amountBorrowed;
    }

    public double getPrice() {
        return price;
    }


    public String getTitle() {
        return title;
    }

    public boolean borrowMovie(){
        if(amountBorrowed == availableCopies){
            System.out.println("All copies of this movie have been borrowed");
            return false;
        }
        else{
            amountBorrowed++;
            return true;
        }
    }

    public boolean returnMovie(){

        if(amountBorrowed != 0) {
            amountBorrowed--;
            System.out.println("Movie returned");
            return true;
        }

        else{
            return false;
        }

    }
}
