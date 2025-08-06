package Day3_ObjectRelationship;
class BankAccount {
    static String bankName = "National Bank";
    static int totalAccounts = 0;
    final String accountNumber;
    String accountHolderName;

    BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC123", "Anya");
        BankAccount acc2 = new BankAccount("ACC456", "Vihaan");

        if (acc1 instanceof BankAccount) {
            System.out.println("Account Number: " + acc1.accountNumber);
            System.out.println("Account Holder: " + acc1.accountHolderName);
            System.out.println("Bank: " + BankAccount.bankName);
        }

        if (acc2 instanceof BankAccount) {
            System.out.println("Account Number: " + acc2.accountNumber);
            System.out.println("Account Holder: " + acc2.accountHolderName);
            System.out.println("Bank: " + BankAccount.bankName);
        }

        BankAccount.getTotalAccounts();
    }
}
