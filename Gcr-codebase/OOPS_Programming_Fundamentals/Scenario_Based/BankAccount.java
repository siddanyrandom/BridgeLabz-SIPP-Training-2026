package ScenarioBasedProblemsOOPs;

public class BankAccount {
    long accountNumber;
    String holder;
    double balance;
    BankAccount(long accountNumber, String holder, double balance){
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Amount must be greater than 0");
            return;
        }
        balance += amount;
        System.out.println("Total Amount after deposit: " + "₹" + balance);
    }

    void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
            return;
        }
        if (amount > balance) {
            System.out.println("Overdraft now allowed");
            return;
        }
        balance -= amount;
        System.out.println("Total Amount after withdrawal: " + "₹" + balance);
    }

    void getStatement() {
        System.out.println("\n----- BANK STATEMENT -----" +
                        "\nAccount No : " + accountNumber +
                        "\nHolder     : " + holder +
                        "\nBalance    : ₹" + balance +
                        "\n--------------------------");
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(111111111111L, "Yashu", 10000);
        BankAccount acc2 = new BankAccount(222222222222L, "Sidd", 15000);
        BankAccount acc3 = new BankAccount(333333333333L, "Aman", 20000);

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.deposit(1500);

        acc2.withdraw(2000);
        acc2.deposit(4000);
        acc2.withdraw(1000);
        acc2.deposit(2500);
        acc2.withdraw(500);

        acc3.deposit(5000);
        acc3.withdraw(7000);
        acc3.deposit(1000);
        acc3.withdraw(2000);
        acc3.deposit(3000);

        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();
    }
}
