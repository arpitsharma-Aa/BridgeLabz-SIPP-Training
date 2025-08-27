class Q3_ItemInventory {
    int itemCode;
    String itemName;
    double price;

    void displayItemDetails(int quantity) {
        double total = quantity * price;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        Q3_ItemInventory item = new Q3_ItemInventory();
        item.itemCode = 301;
        item.itemName = "Pen";
        item.price = 15.0;
        item.displayItemDetails(20);
    }
}
