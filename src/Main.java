package src;
import java.util.Scanner;
public class Main {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("UTP A AMALIYAH SYAHIDATUN NI'MAH");
        
        while (true) {
                // Menampilkan opsi 
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Exit");
                System.out.print("Pick your choice : ");
                int opsi = input.nextInt();
                input.nextLine();
                if (opsi == 1) {
                    System.out.println("Login to our system");
                    // System.out.print("Fullname :");
                    // input.nextInt();
                    // System.out.println("Email :");
                    // System.out.println("Password :");       
                } else if (opsi == 2) {
                   
                } else if (opsi == 3) {
                
                    break;
                } else {
                    
                }
            }
        }
    }

