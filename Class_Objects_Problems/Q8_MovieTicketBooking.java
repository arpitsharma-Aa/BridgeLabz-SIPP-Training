class Q8_MovieTicketBooking {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String name, int seat, double rate) {
        movieName = name;
        seatNumber = seat;
        price = rate;
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat No.: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Q8_MovieTicketBooking ticket = new Q8_MovieTicketBooking();
        ticket.bookTicket("Avengers", 21, 250);
        ticket.displayTicket();
    }
}
