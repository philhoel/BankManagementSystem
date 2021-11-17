import java.util.HashMap;
import java.util.ArrayList;

public class Bank {

    private HashMap<String,User> users;
    private HashMap<String, String> passwordMap;
    private int passwordMinLength;
    private ArrayList<Integer> accountList;

    public Bank() {

        users = new HashMap<String,User>();
        passwordMap = new HashMap<String, String>();
        passwordMinLength = 8;
        accountList = new ArrayList<Integer>();
    }

    // Creates a new user and adds it to the users map
    // with both username and a new password
    public void createUser() {

    }

    // Matches username and password to check if a match is found
    public void signIn() {

    }

    // Updates any new account to the overall
    // list of accounts in the bank
    public void newAccount() {

    }
}