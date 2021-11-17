public class Account {

    private String name;
    private int ID;
    private String belongsToUser;
    private double amount;
    private double[] withdrawalLog; // withdrawalLog
    private double[] depositLog; // depositLog

    int i;
    int j;

    public Account(String name, int ID, String username) {
        this.name = name;
        this.ID = ID;
        this.belongsToUser = username;
        this.amount = 0;
        this.withdrawalLog = new double[100];
        this.depositLog = new double[100];
        this.i = 0;
        this.j = 0;
    }

    public String getName() {
        return name;
    }

    public String getBelongsToUser() {
        return belongsToUser;
    }

    public double getAmount() {
        return amount;
    }

    public double[] getWithdrawalLog() {
        return withdrawalLog;
    }

    public double[] getDepositLog() {
        return depositLog;
    }

    public void addToWithdrawalLog(double x) {
        if (i < 100) {
            withdrawalLog[i] = x;
            i++;
        } else {
            for (int v = 1; v < 100; v++) {
                withdrawalLog[v-1] = withdrawalLog[v];
            }

            withdrawalLog[99] = x;
        }
    }

    public void addToDepositLog(double x) {

        if (j < 100) {
            depositLog[j] = x;
            j++;
        } else {
            for (int v = 1; v < 100; v++) {
                depositLog[v-1] = depositLog[v];
            }

            depositLog[99] = x;
        }

    }

    public void deposit(double x) {
        amount += x;
        addToDepositLog(x);
    }

    public double withdrawal(double x) {
        if ((amount - x) >= 0) {
            amount -= x;
            addToWithdrawalLog(x);
            return x;
        } else {
            //throw new Exception("Cannot withdraw this amount");
            return 0;
        }
    }


}