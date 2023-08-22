package filehandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Stocks {

    static class Stock {
        String symbol;
        String name;
        double price;

        public Stock(String symbol, String name, double price) {
            this.symbol = symbol;
            this.name = name;
            this.price = price;
        }
    }

    public static class StockManager {
        private List<Stock> stocks = new ArrayList<>();
        private Scanner sc = new Scanner(System.in);

        public void createStock() {
            System.out.println("Enter stock symbol:");
            String symbol = sc.nextLine();
            System.out.println("Enter stock name:");
            String name = sc.nextLine();
            System.out.println("Enter stock price:");
            double price = sc.nextDouble();
            sc.nextLine();  // Consume newline

            Stock stock = new Stock(symbol, name, price);
            stocks.add(stock);
            System.out.println("Stock added successfully.");
        }

        public void displayStocks() {
            for (Stock stock : stocks) {
                System.out.println("Symbol: " + stock.symbol + ", Name: " + stock.name + ", Price: " + stock.price);
            }
        }

        // Implement updateStock() and deleteStock() methods

        public static void main(String[] args) {
            StockManager stockManager = new StockManager();
            boolean exit = false;
            while (!exit) {
                System.out.println("\nStock CRUD Operations:");
                System.out.println("1. Create Stock");
                System.out.println("2. Display Stocks");
                System.out.println("3. Update Stock");
                System.out.println("4. Delete Stock");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = stockManager.sc.nextInt();
                stockManager.sc.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        stockManager.createStock();
                        break;
                    case 2:
                        stockManager.displayStocks();
                        break;
                    // Implement cases for update, delete, and exit
                    case 5:
                        exit = true;
                        System.out.println("Exiting.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }
    }

}
