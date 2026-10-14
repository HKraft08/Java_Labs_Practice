public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount (String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit (double amount) {
        if (amount > 0) {

            System.out.println("Deposit amount: R" + amount);
            this.balance = this.balance + amount;

        } else {
            System.out.println("Please enter an amount greater than 0");
        }
    }

    void withdraw (double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {

                System.out.println("Withdrawal amount: R" + amount);
                this.balance = this.balance - amount;

            } else {
                System.out.println("The amount you are withdrawing must be less than or equal to your balance");
            }
        } else {
            System.out.println("Please enter an amount greater than 0");
        }
    }

    void getBalance() {
        System.out.println("Your balance is: R" + this.balance);
    }
}
