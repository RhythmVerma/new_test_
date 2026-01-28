class Account {
    int accountNumber;
    double balance;

    Account(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    void transfer(Account receiver, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
            System.out.println("Transfer Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class OPERATORS {
    public static void main(String[] args) {

        // Create two accounts
        Account acc1 = new Account(101, 5000);
        Account acc2 = new Account(102, 3000);

        System.out.println("Before Transfer:");
        acc1.display();
        acc2.display();

        acc1.transfer(acc2, 2000);

        System.out.println("After Transfer:");
        acc1.display();
        acc2.display();
    }
}
