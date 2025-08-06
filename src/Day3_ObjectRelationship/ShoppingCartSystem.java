package Day3_ObjectRelationship;
class Product {
    static double discount = 10.0;
    final String productID;
    String productName;
    double price;
    int quantity;

    Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 60000.0, 1);
        Product p2 = new Product("P002", "Headphones", 2000.0, 2);

        if (p1 instanceof Product) {
            System.out.println("Product ID: " + p1.productID);
            System.out.println("Name: " + p1.productName);
            System.out.println("Price: " + p1.price);
            System.out.println("Quantity: " + p1.quantity);
            System.out.println("Discount: " + Product.discount + "%");
        }

        if (p2 instanceof Product) {
            System.out.println("Product ID: " + p2.productID);
            System.out.println("Name: " + p2.productName);
            System.out.println("Price: " + p2.price);
            System.out.println("Quantity: " + p2.quantity);
            System.out.println("Discount: " + Product.discount + "%");
        }

        Product.updateDiscount(15.0);
        System.out.println("Updated Discount: " + Product.discount + "%");
    }
}
