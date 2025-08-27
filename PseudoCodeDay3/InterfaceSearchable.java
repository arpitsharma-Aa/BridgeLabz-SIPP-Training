// Interface Searchable
INTERFACE Searchable {
    METHOD search(String query)
}

// Interface Printable
INTERFACE Printable {
    METHOD print()
}

// Abstract MedicalReport class implementing interfaces
ABSTRACT CLASS MedicalReport IMPLEMENTS Searchable, Printable {
    STRING patientName

    METHOD MedicalReport(name) {
        patientName = name
    }
}

// LabReport class
CLASS LabReport EXTENDS MedicalReport {
    METHOD search(query) {
        PRINT "Searching lab report for " + query
    }
    METHOD print() {
        PRINT "Printing lab report of " + patientName
    }
}

// PrescriptionReport class
CLASS PrescriptionReport EXTENDS MedicalReport {
    METHOD search(query) {
        PRINT "Searching prescription for " + query
    }
    METHOD print() {
        PRINT "Printing prescription of " + patientName
    }
}

// MAIN
lab = LabReport("Amit")
presc = PrescriptionReport("Priya")

lab.search("blood test")
lab.print()

presc.search("antibiotics")
presc.print()
