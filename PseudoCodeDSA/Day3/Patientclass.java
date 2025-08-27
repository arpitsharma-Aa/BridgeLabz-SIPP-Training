// Patient class
CLASS Patient {
    STRING patientID
    STRING name
    INT age
}

// Patient Record Manager
CLASS PatientManager {
    MAP<String, Patient> patientMap = EMPTY_MAP()

    METHOD addPatient(patient) {
        patientMap[patient.patientID] = patient
    }

    METHOD getPatient(id) {
        RETURN patientMap.get(id)
    }

    METHOD updatePatient(id, updatedPatient) {
        IF patientMap.containsKey(id) THEN
            patientMap[id] = updatedPatient
        ENDIF
    }

    METHOD deletePatient(id) {
        patientMap.remove(id)
    }
}

// MAIN
manager = PatientManager()

p1 = Patient("P001", "Amit", 30)
manager.addPatient(p1)

p2 = manager.getPatient("P001")
PRINT p2.name

p1Updated = Patient("P001", "Amit Kumar", 31)
manager.updatePatient("P001", p1Updated)

manager.deletePatient("P001")
