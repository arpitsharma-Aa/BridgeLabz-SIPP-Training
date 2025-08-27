CLASS Member {
    STRING name
    INT id
    DATE membershipDate
    INT validityYears

    METHOD Member(n, i, date, validity) {
        name = n
        id = i
        membershipDate = date
        validityYears = validity
    }

    METHOD isMembershipValid(currentDate) {
        expiryDate = membershipDate + validityYears years
        RETURN currentDate <= expiryDate
    }
}

// MAIN
member1 = Member("Ujjwal", 101, "2023-01-01", 2)

IF member1.isMembershipValid("2024-12-31") THEN
    PRINT "Membership is valid"
ELSE
    PRINT "Membership expired"
ENDIF
