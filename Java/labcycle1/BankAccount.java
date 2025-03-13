package lab1cycle;

public class BankAccount {
    String accnum;
    String acchold;
    double bal;

    public BankAccount(String accnum, String acchld, double Bal) {
        this.accnum=accnum;
        this.acchold=acchld;
        this.bal=Bal;
    }

    public void deposit(double amount) {
        if(amount>0) {
            bal+=amount;
            System.out.println("Deposited: " + amount);
        } else{
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount>0) {
            if(amount<=bal) {
                bal-=amount;
                System.out.println("Withdrew: " +amount);
            } else{
                System.out.println("Insufficient funds.");
            }
        } else{
            System.out.println("Withdrawal amount must be positive");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " +accnum);
        System.out.println("Account Holder: " +acchold);
        System.out.println("Balance: " + bal);
    }

    public static void main(String[] args) {
        BankAccount account=new BankAccount("1400056189", "AZEEM N", 20000.75);
        account.deposit(500.00);
        account.withdraw(2000.00);
        account.displayAccountInfo();
    }
}

