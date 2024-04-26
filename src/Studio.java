package src;
public class Studio{
    private Movie movie;
    private String type;
    private boolean[][] seats;

    public Studio(String type){
        this.type=type;
    }
    public String getStudioInfo(){
        return movie.studioInfo();
    }
    public int isBooked(char row, int col){
        return isBooked(row, col);
    }
    public boolean reserve(char row, int col){
        return reserve(row, col);
    }
    public Movie getMovie() {
        return movie;
    }
    public String getType() {
        return type;
    }
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    public void setSeats(boolean[][] seats) {
        this.seats = seats;
    }
}