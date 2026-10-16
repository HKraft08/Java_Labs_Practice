public class ShoppingCart {

    String productName;
    double price;
    int productQuantity;

    static double subTotal = 0;
    static  double finalTotal = 0;

    ShoppingCart(String productName, double price, int productQuantity) {

        if (price <= 0) {
            throw new IllegalArgumentException("Prices entered by be greater than 0");
        }

        if (productQuantity <= 0) {
            throw new IllegalArgumentException("Quantities entered must be greater than 0");
        }

        this.productName = productName;
        this.price = price;
        this.productQuantity = productQuantity;
    }

    void lineTotal() {
        double lineTotal = this.price * this.productQuantity;

        System.out.println("line total: " + this.productName + " x " + this.productQuantity + " x R" + this.price
                + " (R" + lineTotal + ")");

        subTotal = subTotal + lineTotal;
    }

    void calculateDiscount() {

        double discountAmount;

        if (subTotal > 1000) {
            discountAmount = subTotal * 0.1;
        } else {
            discountAmount = 0;
        }

        finalTotal = subTotal - discountAmount;
        System.out.println("Discount amount: R" + discountAmount);
    }

    void displaySubTotal() {
        System.out.println("Subtotal: R" + subTotal);
    }

    void displayFinalTotal() {
        System.out.println("Final total: R" + finalTotal);
    }

}
