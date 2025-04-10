import java.util.Scanner;

//Abstraction
abstract class BankAccount {
    // OOP Concept: Encapsulation
    // Data members are private/protected and accessed via methods
    private static int idCounter = 1000;
    private final int accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String holderName, double initialDeposit) {
        this.accountNumber = idCounter++;
        this.holderName = holderName;
        this.balance = initialDeposit;
    }

    // OOP Concept: Encapsulation via getter
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    // Encapsulation: setter to modify holderName
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // OOP Concept: Abstraction
    // Abstract method forces subclasses to provide implementation
    public abstract void withdraw(double amount);

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

//Inheritance

class CurrentAccount extends BankAccount {
    public CurrentAccount(String name, double deposit) {
        super(name, deposit);
    }

    //Polymorphism (Method Overriding)
    
    @Override
    public void withdraw(double amount) {
        double limit = 1000; // Overdraft limit
        if (amount > 0 && amount <= (balance + limit)) {
            balance -= amount;
            System.out.println("Withdrawn from Current Account.");
        } else {
            System.out.println("Exceeds overdraft limit or invalid amount.");
        }
    }
}

// Main 
public class BankingManagementSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null; // Using Abstraction (reference of abstract type)

        while (true) {
            System.out.println("\n---- Bank Account Menu ----");
            System.out.println("1. Create Account");
            System.out.println("2. Update Account");
            System.out.println("3. Delete Account");
            System.out.println("4. View Account Details");
            System.out.println("5. Deposit Money");
            System.out.println("6. Withdraw Money");
            System.out.println("7. Balance Enquiry");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    String holderName = scanner.nextLine();
                    System.out.print("Enter initial deposit amount: ");
                    double initialDeposit = scanner.nextDouble();

                    // OOP Concept: Polymorphism - using parent type reference to child object
                    account = new CurrentAccount(holderName, initialDeposit);
                    System.out.println("Account created successfully.");
                    break;

                case 2:
                    if (account == null) {
                        System.out.println("No account found.");
                    } else {
                        System.out.print("Enter new account holder name: ");
                        String newHolderName = scanner.nextLine();
                        account.setHolderName(newHolderName);
                        System.out.println("Account updated successfully.");
                    }
                    break;

                case 3:
                    if (account == null) {
                        System.out.println("No account found.");
                    } else {
                        account = null;
                        System.out.println("Account deleted successfully.");
                    }
                    break;

                case 4:
                    if (account == null) {
                        System.out.println("No account found.");
                    } else {
                        account.displayDetails();
                    }
                    break;

                case 5:
                    if (account == null) {
                        System.out.println("No account found.");
                    } else {
                        System.out.print("Enter deposit amount: ");
                        try {
                            double depositAmount = scanner.nextDouble();
                            account.deposit(depositAmount);
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            scanner.next(); // clear invalid input
                        }
                    }
                    break;

                case 6:
                    if (account == null) {
                        System.out.println("No account found.");
                    } else {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount); // Polymorphic call
                    }
                    break;

                case 7:
                    if (account == null) {
                        System.out.println("No account found.");
                    } else {
                        System.out.println("Current balance: " + account.getBalance());
                    }
                    break;

                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}