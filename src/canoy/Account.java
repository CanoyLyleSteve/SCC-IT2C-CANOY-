package canoy;

import java.util.Scanner;

public class Account {
    
   
    public void handleAccounts() {
        Scanner sc = new Scanner(System.in);
        Accounts[] accountsArray = new Accounts[100];

        System.out.print("Enter number of accounts: ");
        int numAccounts = sc.nextInt();
        sc.nextLine(); 

        for (int x = 0; x < numAccounts; x++) {
            System.out.println("Enter details for account " + (x + 1) + ":");
            System.out.print("ID: ");
            double id = sc.nextDouble(); 
            sc.nextLine(); 
            System.out.print("First Name: ");
            String firstName = sc.nextLine();
            System.out.print("Last Name: ");
            String lastName = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();

            accountsArray[x] = new Accounts();
            accountsArray[x].addAccount(id, firstName, lastName, email, username, password);
        }

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n",
                "ID", "FIRST NAME", "LAST NAME", "EMAIL", "USERNAME", "PASSWORD");

        for (int x = 0; x < numAccounts; x++) {
            accountsArray[x].viewAccount();
        }

        sc.close();
    }
}

