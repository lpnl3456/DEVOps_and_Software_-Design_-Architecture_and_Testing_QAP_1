package Movie_Rental;

public class RentalCompany {

    private String name;
    private double equity = 0;

    public RentalCompany(String name){

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEquity() {
        return equity;
    }

    public void setEquity(double equity) {
        this.equity = equity;
    }

    public void increaseEquity(double price){
        equity = equity + price;
    }
}
