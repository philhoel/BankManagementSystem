import java.util.ArrayList;
import java.util.HashMap;

public class User {

    private String name;
    private String username;
    private String password;
    private int age;
    private HashMap<String,Integer> accountList;

    public User() {

    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    // gets the map between account names and account IDs
    public HashMap<String,Integer> getAccountList() {
        return accountList;
    }

    public void deposit(int x) {

    }

    // Adds the amount from each account of the user
    // to a list and returns it
    public ArrayList<Double> checkBalance() {

    }

    // Withdraws money from account
    // Gives error if the amount becomes negtive
    public double withdrawal(double x) {

    }

    // Calls withdrawal from one account and deposits to another
    // internally
    public void transfer(int x, String from, String to) {

    }

    public ArrayList<Double> getActivityLog(String accountName) {

    }

}