/**
 * Trevor Richardson
 * Version 1.1
 * 04/11/22
 * Registration
 * Allows user to setup and redeem rewards
 */
import java.util.Scanner;
public class Registration {
    public static void main(String[] args) {
    String firstName;
    String lastName;
    double initialBalance = 0.0;
    int choice = 0;
    double redeem;
    RewardsAccount account = null;

    while(choice != 4){ //Menu
        System.out.println("Please select your desired option: ");
        System.out.println(" ");
        System.out.println("Press 1 to create an account: ");
        System.out.println("Press 2 to redeem rewards: ");
        System.out.println("Press 3 to check rewards balance: ");
        System.out.println("Press 4 to exit application: ");

        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();

        if (choice == 1){ //Creates account
            System.out.println("Welcome to your rewards account registration page!");
            System.out.println("Please enter your first name: ");
            firstName = scan.next();
            System.out.println("Please enter your last name: ");
            lastName = scan.next();
            account = new RewardsAccount(firstName, lastName, initialBalance);
            account.setAccountNumber();
            System.out.println("Your account has been successfully created!");
            System.out.println("Your account number is: " + account.getAccountNumber());
            System.out.println(" ");
        }
        else if (choice == 2){ //Redeem rewards
            System.out.println("How much of your rewards would you like to redeem? ");
            redeem = scan.nextDouble();
            if(initialBalance <= 0){
                redeem = 0;
                System.out.println("You have nothing to redeem at this time.");
            }else{
                account.redeem(redeem);
                System.out.println("The amount $" + String.format("%.2f",redeem) + " has been redeemed.");
                System.out.println(" ");
            }
        }
        else if (choice == 3){ //Check rewards balance
            System.out.println("Your current rewards balance is: $" + String.format("%.2f",account.getBalance()));
            System.out.println(" ");
        }
    }
    System.out.println("Have a great day!"); //Exit


  }    
}

