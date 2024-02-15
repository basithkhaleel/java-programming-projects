import java.util.Scanner;

// Class representing a bank account
class Account {
    private String accountNumber;
    private String pin;
    private double balance;

    // Constructor
    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
}

// Class representing the ATM
public class ATM {
    private Account currentAccount;

    // Constructor
    public ATM() {
        // Initialize with some default account
        currentAccount = new Account("123456", "1234", 1000.0);
    }

    // Method to authenticate user
    private boolean authenticate(String accountNumber, String pin) {
        return currentAccount.getAccountNumber().equals(accountNumber) && currentAccount.getPin().equals(pin);
    }

    // Method to start ATM
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM");

        // Loop until user exits
        while (true) {
            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Enter PIN: ");
            String pin = scanner.nextLine();

            if (authenticate(accountNumber, pin)) {
                System.out.println("Authentication successful");
                // Display options
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        currentAccount.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        currentAccount.withdraw(withdrawAmount);
                        break;
                    case 3:
                        currentAccount.displayBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM");
                        return;
                    default:
                        System.out.println("Invalid option");
                }
            } else {
                System.out.println("Authentication failed. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }
}

