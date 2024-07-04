import java.util.Scanner;


class ATM {
    private double balance; 

   
    public ATM(double initialBalance) {
        balance = initialBalance;
    }

   
    public double checkBalance() {
        return balance;
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

   
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        
        ATM atm = new ATM(5000.0);

        
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    
                    System.out.println("Your balance is $" + atm.checkBalance());
                    break;
                case 2:
                  
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                   
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                   
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    System.exit(0); 
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }
    }
}
