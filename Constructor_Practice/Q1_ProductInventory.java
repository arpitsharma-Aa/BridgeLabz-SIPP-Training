public class Q1_ProductInventory {
    String productName;
    double price;
    static int totalProducts = 0;

    Q1_ProductInventory(String name, double cost) {
        productName = name;
        price = cost;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Q1_ProductInventory p1 = new Q1_ProductInventory("Laptop", 50000);
        Q1_ProductInventory p2 = new Q1_ProductInventory("Phone", 20000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Q1_ProductInventory.displayTotalProducts();
    }
}
