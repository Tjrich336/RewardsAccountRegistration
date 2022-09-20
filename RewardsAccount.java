/**
 * Trevor Richardson
 * Version 1.0
 * 04/11/22
 * RewardsAccount
 * Class for registration
 */
public class RewardsAccount {
    private String firstName;
    private String lastName;
    private int accountNumber = 0;
    private double currentBalance = 0.00;
    private double initialBalance = 0.00;
    private double  total = 0.00;
    private double redeem =  0.00;

    public RewardsAccount(String firstName, String lastName, double initialBalance){
        this.firstName = firstName;
        this.lastName = lastName;
        currentBalance = initialBalance;
    }
    void setAccountNumber(){
        accountNumber ++;
    }
    int getAccountNumber(){
        return accountNumber;
    }
    double getBalance(){
        return currentBalance;
    }
    void redeem(double redeem){
       currentBalance -= redeem;
    }
    void checkBalance(){
       total = currentBalance - redeem;
    }





}
