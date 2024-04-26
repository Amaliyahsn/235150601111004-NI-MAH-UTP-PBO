package src;
public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private Ticket[] ticketList;
    private int MAXTICKET;
    private Ticket ticket;

    public User(String email, String password, String fullName, double balance){
        this.email=email;
        this.password=password;
        this.fullName=fullName;
        this.balance=balance;
        
    }

    public boolean addTicket(Ticket ticket) {
        this.ticket= ticket;
        return false;
    }
    public void displayAllTicket(){

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }

    public Ticket[] getTicketList() {
        return ticketList;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


}