public class Main {

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("National Australia Bank");

        if(bank.addBranch("Delhi")) {
            System.out.println("Delhi branch created");
        }

        bank.addCustomer("Delhi", "Ayush", 50.05);
        bank.addCustomer("Delhi", "Mohan", 175.34);
        bank.addCustomer("Delhi", "Paratik", 220.12);

        bank.addBranch("Mumbai");
        bank.addCustomer("Mumbai", "Bob", 150.54);

        bank.addCustomerTransaction("Delhi", "Ayush", 44.22);
        bank.addCustomerTransaction("Delhi", "Mohan", 12.44);
        bank.addCustomerTransaction("Delhi", "Paratik", 1.65);

        bank.listCustomers("Delhi", true);
        bank.listCustomers("Mumbai", true);

        bank.addBranch("Kolkata");

        if(!bank.addCustomer("Kolkata", "Babu Roy", 5.53)) {
            System.out.println("Error Kolkata branch does not exist");
        }

        if(!bank.addBranch("Delhi")) {
            System.out.println("Delhi branch already exists");
        }

        if(!bank.addCustomerTransaction("Delhi", "Sohan", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Delhi", "Ayush", 12.21)) {
            System.out.println("Customer Ayush already exists");
        }
    }
}
