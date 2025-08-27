class Q9_ShoppingCart {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double cost, int qty) {
        itemName = name;
        price = cost;
        quantity = qty;
    }

    void removeItem() {
        itemName = null;
        price = 0;
        quantity = 0;
    }

    void displayTotal() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        Q9_ShoppingCart cart = new Q9_ShoppingCart();
        cart.addItem("Headphones", 499.99, 2);
        cart.displayTotal();
        cart.removeItem();
        System.out.println("Item removed.");
        cart.displayTotal();
    }
}
