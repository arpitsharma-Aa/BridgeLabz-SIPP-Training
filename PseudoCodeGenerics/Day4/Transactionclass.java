// Transaction class
CLASS Transaction {
    STRING merchant
    STRING month
    DOUBLE amount
}

LIST<Transaction> transactions = [
    Transaction("Amazon", "Jan", 1200),
    Transaction("Flipkart", "Jan", 800),
    Transaction("Amazon", "Feb", 1500),
    Transaction("Flipkart", "Feb", 600),
    Transaction("Amazon", "Jan", 500)
]

// Group by merchant and month, sum amounts
report = transactions.stream()
                     .collect(
                        groupingBy(
                            txn -> txn.merchant,
                            groupingBy(
                                txn -> txn.month,
                                summingDouble(txn -> txn.amount)
                            )
                        )
                     )

// Display report
FOR each merchantEntry IN report
    PRINT "Merchant: " + merchantEntry.key
    FOR each monthEntry IN merchantEntry.value
        PRINT " " + monthEntry.key + " => " + monthEntry.value
