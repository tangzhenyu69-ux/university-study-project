package universitystudy.PA2demo1;

public class PrintAccount {
    public static final int MAX_BALANCE = 10000;
    private int initialBalance;

    public PrintAccount(int initialBalance) {
        if (initialBalance >= 0 && initialBalance <= MAX_BALANCE) {
            this.initialBalance = initialBalance;
        }
    }

    public int getBalance() {
        return initialBalance;
    }

    public boolean topUp(int amount) {
        if (initialBalance + amount <= MAX_BALANCE && amount > 0) {
            this.initialBalance = initialBalance + amount;
            return true;
        } else
            return false;
    }

    public boolean pay(int amount) {
        if (amount <= initialBalance && amount > 0) {
            this.initialBalance = initialBalance - amount;
            return true;
        } else
            return false;
    }
}
