package src;
public class Cinema {
    private String name;
    private User[] listUsers;
    private Studio[] listStudio;
    private int studioCapacity;

    public Cinema( String name, int studioCapacity){
        this.name=name;
        this.studioCapacity = studioCapacity;
    }
    private void init(){}

    public boolean registerUser(User user){
        return false;
    }
    public void authenticateUser(String email, String password){

    }
    public void displayListStudi(){

    }
    public void displayStudioDetail(int studioNumber){

    }
    public double addStudioWithMovies(String studioType, String movieTitle, double movieRating, String[] movieGenres){
        return addStudioWithMovies(studioType, movieTitle, movieRating, movieGenres);

    }
    
}