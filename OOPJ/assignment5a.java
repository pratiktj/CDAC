//assignment 5
 class BankAccount {
    
    private double balance;

  
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    
    public double getBalance() {
        return balance;
    }
}


class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

 
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of INR100 required.");
        }
    }
}


public class assignment5a {
    
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(500);
        account.deposit(200);
        account.withdraw(100);
        System.out.println("BankAccount balance: " + account.getBalance());

        
        SavingsAccount savings = new SavingsAccount(500);
        savings.deposit(200);
        savings.withdraw(600); 
        savings.withdraw(100); 
        System.out.println("SavingsAccount balance: " + savings.getBalance());
    }
}
