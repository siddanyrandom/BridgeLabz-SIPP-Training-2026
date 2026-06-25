package ScenarioBasedProblemsOOPs.Encapsulation_And_Abstraction;

abstract class BankAccount{
    private String accountNumber,holderName; private double balance;
    public BankAccount(String a,String h,double b){
        accountNumber=a;holderName=h;balance=b;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double b){
        balance=b;
    }
    public void deposit(double a){
        balance+=a;
    }
    public void withdraw(double a){
        balance-=a;
    }
    public void displayAccountDetails(){
        System.out.println(accountNumber+" "+holderName+" "+balance);
    }
    public abstract double calculateInterest();
}
class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(String a,String h,double b,double r){
        super(a,h,b);interestRate=r;
    }
    public double calculateInterest(){
        return getBalance()*interestRate/100;
    }
}
class CurrentAccount extends BankAccount{
    private double monthlyBonusRate;
    public CurrentAccount(String a,String h,double b,double r){
        super(a,h,b);monthlyBonusRate=r;
    }
    public double calculateInterest(){
        return getBalance()*monthlyBonusRate/100;
    }
}
public class BankingSystem{
    public static void main(String[] args){
        SavingsAccount s=new SavingsAccount("101","A",10000,5);
        s.deposit(1000);
        s.withdraw(500);
        s.displayAccountDetails();
        System.out.println(s.calculateInterest());
        CurrentAccount c=new CurrentAccount("102","B",15000,2);
        c.displayAccountDetails();
        System.out.println(c.calculateInterest());
    }
}
