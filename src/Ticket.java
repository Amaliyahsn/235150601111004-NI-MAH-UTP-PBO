package src;
public class Ticket {
    private Movie movie;
    private int studioNumber;
    private double price;
    private String seat;

    public Ticket(Movie movie, int studioNumber, double price, String seat) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.price = price;
        this.seat = seat;
    }
    public String getTicketInfo(String ticketInfo){
        return ticketInfo;
    }

    public Movie getMovie() {
        return movie;
    }
    
    public int getStudioNumber() {
        return studioNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeat() {
        return seat;
    }

    public double getTicketPrice (String type, double ticketPrice){
        return ticketPrice;
    }


}
