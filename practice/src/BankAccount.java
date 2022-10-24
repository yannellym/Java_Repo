public class BankAccount {
    // static variables for things that are going to be common across the class object
    // non-static variables for things that are going ot be unique across the class object
    static String bankName = "Bank of America";
    String accountHoldersName;
    String accountNumber;
    float balance;
    public static void main(String[] args) {
        // will be gone as soon as block is over
        double loanInterestRate = 5.7;
        System.out.println(BankAccount.bankName);
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountHoldersName = "Nelly";
        bankAccount.accountNumber = "123456789";
        bankAccount.balance = 10000f;
        System.out.println(bankAccount.balance);
    }
}
