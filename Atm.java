import java.util.Scanner ;
public class Atm{
    static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args)
    {
        double balance = 9.99 ;
        boolean isRunning = true ;
        int choice ;

        while(isRunning)
        {
            System.out.println("****************");
            System.out.println("Banking Programm");
            System.out.println("****************");
            System.out.println("1. Check balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt() ;

            switch(choice)
            {
                case 1 -> showBalance(balance) ;
                case 2 -> balance += deposit() ;
                case 3 -> balance -= withdraw(balance) ;
                case 4 -> isRunning = false ;
                default -> System.out.println("Wrong choice!!!Choose between 1 to 4") ;
            }
        }
        System.out.println("Exiting...");
        System.out.println("\nThank you for choosing our bank");
        scanner.close() ;
    }
    static void showBalance(double balance)
    {
        System.out.println("****************");
        System.out.printf("You'r current balance is: $%.2f\n" , balance) ;
    }
    static double deposit()
    {
        double amount ;
        System.out.print("Enter an amount to deposit: ") ;
        amount = scanner.nextDouble() ;
        if(amount < 0)
        {
            System.out.println("Ammount is negetive") ;
            return 0;
        }
        else
        {
            System.out.printf("Deposited $%.2f\n" , amount) ;
            return amount ;
        }
    }
    static double withdraw(double balance)
        {
            double amount ;
            System.out.print("Enter the amount you want to Withdraw: ");
            amount = scanner.nextDouble() ;
            if(amount < 0 )
            {
                System.out.println("Amount can't be negetive") ;
                return 0 ;
            }
            else if(amount > balance)
            {
                System.out.println("Insufficient balance") ;
                return 0 ;
            }
            else
            {
                System.out.printf("Witdrawed $%.2f\n" , amount);
                return amount ;
            }
        }
}
