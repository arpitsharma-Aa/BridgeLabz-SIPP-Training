class Q4_MobilePhoneDetails {
    String brand;
    String model;
    double price;

    void displayPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Q4_MobilePhoneDetails phone = new Q4_MobilePhoneDetails();
        phone.brand = "Samsung";
        phone.model = "Galaxy M14";
        phone.price = 12999.00;
        phone.displayPhoneDetails();
    }
}
