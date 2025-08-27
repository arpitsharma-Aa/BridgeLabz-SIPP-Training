// Generic Transaction class
CLASS Transaction<T> {
    T paymentDetails
    DOUBLE amount

    METHOD Transaction(details, amt) {
        paymentDetails = details
        amount = amt
    }

    METHOD processPayment() {
        PRINT "Processing payment of amount: " + amount
    }
}

// UPI payment class
CLASS UPI {
    STRING upiID
}

// Card payment class
CLASS Card {
    STRING cardNumber
    STRING cardHolderName
}

// NetBanking payment class
CLASS NetBanking {
    STRING bankName
    STRING accountNumber
}

// MAIN
upiPayment = UPI("user@bank")
cardPayment = Card("1234-5678-9876-5432", "Amit Kumar")
netBankingPayment = NetBanking("HDFC", "987654321")

transaction1 = Transaction<UPI>(upiPayment, 1000.0)
transaction2 = Transaction<Card>(cardPayment, 2500.0)
transaction3 = Transaction<NetBanking>(netBankingPayment, 3000.0)

transaction1.processPayment()
transaction2.processPayment()
transaction3.processPayment()
