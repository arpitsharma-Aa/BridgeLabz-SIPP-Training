class Q6_ATMSimulation {
    String accountHolder;
    long accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Q6_ATMSimulation acc = new Q6_ATMSimulation();
        acc.accountHolder = "Ravi Kumar";
        acc.accountNumber = 123456789;
        acc.balance = 5000;

        acc.deposit(2000);
        acc.withdraw(1500);
        acc.displayBalance();
    }
}
