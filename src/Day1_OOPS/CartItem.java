package Day1_OOPS;
import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(String name, double price, int quantity) {
        items.add(new CartItem(name, price, quantity));
        System.out.println(name + " added to cart.");
    }

    void removeItem(String name) {
        items.removeIf(item -> item.itemName.equals(name));
        System.out.println(name + " removed from cart.");
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.price * item.quantity;
        }
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book", 100, 2);
        cart.addItem("Pen", 10, 5);
        cart.displayTotalCost();
        cart.removeItem("Pen");
        cart.displayTotalCost();
    }
}
