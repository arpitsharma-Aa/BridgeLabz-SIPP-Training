// Base Account class
CLASS Account {
    STRING accountNumber
    DOUBLE balance

    METHOD Account(num, bal) {
        accountNumber = num
        balance = bal
    }

    METHOD deposit(amount) {
        balance = balance + amount
    }

    METHOD withdraw(amount) {
        // To be overridden
        PRINT "Generic withdrawal"
    }

    METHOD getBalance() {
        RETURN balance
    }
}

// Saving Account with withdrawal limit
CLASS SavingAccount EXTENDS Account {
    DOUBLE minBalance = 1000

    METHOD SavingAccount(num, bal) {
        SUPER(num, bal)
    }

    METHOD withdraw(amount) {
        IF balance - amount >= minBalance THEN
            balance = balance - amount
            PRINT "Withdrawal successful, remaining balance: " + balance
        ELSE
            PRINT "Insufficient balance (Min balance required: " + minBalance + ")"
        ENDIF
    }
}

// Current Account with overdraft
CLASS CurrentAccount EXTENDS Account {
    DOUBLE overdraftLimit = 5000

    METHOD CurrentAccount(num, bal) {
        SUPER(num, bal)
    }

    METHOD withdraw(amount) {
        IF balance - amount >= -overdraftLimit THEN
            balance = balance - amount
            PRINT "Withdrawal successful, remaining balance: " + balance
        ELSE
            PRINT "Withdrawal exceeds overdraft limit!"
        ENDIF
    }
}

// MAIN
saving = SavingAccount("S001", 5000)
saving.withdraw(4500)

current = CurrentAccount("C001", 2000)
current.withdraw(6000)
