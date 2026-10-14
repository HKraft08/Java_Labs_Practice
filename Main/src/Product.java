import java.lang.constant.Constable;

public class Product {

    int productId;
    String productName;
    double price;
    int stockQuantity;

    Product (int productId, String productName, double price, int stockQuantity) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    void displayProductDetails() {
        System.out.println("Product ID: " + this.productId);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: R" + this.price);
        System.out.println("Stock Quantity: " + this.stockQuantity);
    }

    void addStock(int amount) {
        if (amount > 0) {

            System.out.println("Stock before adding: " + this.stockQuantity);
            this.stockQuantity = this.stockQuantity + amount;
            System.out.println("Stock after adding: " + this.stockQuantity);

        } else {
            System.out.println("Please enter a quantity greater than 0");
        }
    }

    void reduceStock(int amount) {

        if (amount <= this.stockQuantity) {

            System.out.println("Stock before sale: " + this.stockQuantity);
            this.stockQuantity = this.stockQuantity - amount;
            System.out.println("Stock after sale: " + this.stockQuantity);

        } else {
            System.out.println("You cannot sell more stock than you have.");
        }
    }

    void calculateStockValue() {
        double stockValue = this.price * this.stockQuantity;

        System.out.println("Total Stock Value: R" + stockValue);
    }

}
