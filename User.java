import java.util.ArrayList;
import java.util.HashMap;

public class User {

    private String name;
    private String username;
    private String password;
    private int age;
    private HashMap<String,Account> accountList;

    public User(String name, String username, String password, int age) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.age = age;
        accountList = new HashMap<String, Account>();

        this.newAccount("Brukskonto", 0);
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
    public HashMap<String,Account> getAccountList() {
        return accountList;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public void newAccount(String name, int ID) {
        this.accountList.put(name, new Account(name, ID, this.username));
    }

    public void deposit(double x, String name) {
        this.accountList.get(name).deposit(x);
    }

    // Adds the amount from each account of the user
    // to a list and returns it
    public ArrayList<Double> checkBalance() {
        ArrayList<Double> myList = new ArrayList<Double>();

        return myList;

    }

    // Withdraws money from account
    // Gives error if the amount becomes negtive
    public double withdrawal(double x, String name) {
        double val = this.accountList.get(name).withdrawal(x);
        return val;
    }

    // Calls withdrawal from one account and deposits to another
    // internally
    public void transfer(int x, String from, String to) {
        double val = this.withdrawal(x, from);
        this.deposit(val, to);
    }

    public ArrayList<String> getActivityLog(String accountName) {
        ArrayList<String> logList = new ArrayList<String>();
        for (Account value : accountList.values()) {
            String myString = "";
            
        }

        return logList;
    }

}