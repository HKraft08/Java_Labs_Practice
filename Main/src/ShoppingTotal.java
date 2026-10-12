public class ShoppingTotal {
    String productName = "Tropika";
    double price = 35.99;
    int quantity = 6;

    void total() {
        System.out.println("Product name: " + productName);
        System.out.println("Total amount: R" + (price * quantity));
    }

    void discountAmount() {
        System.out.println("Discount amount: R" + ((price * quantity) - (price * quantity) * 0.1));
    }
}
