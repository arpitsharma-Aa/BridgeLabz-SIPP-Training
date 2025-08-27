// Doctor class
CLASS Doctor {
    STRING name
    STRING specialization

    METHOD Doctor(n, s) {
        name = n
        specialization = s
    }
}

// Hospital Department Mapper
CLASS Hospital {
    MAP<String, LIST<Doctor>> departmentMap

    METHOD addDoctor(department, doctor) {
        IF departmentMap[department] DOES NOT EXIST
            departmentMap[department] = []
        ENDIF
        departmentMap[department].add(doctor)
    }

    METHOD getDoctorsBySpecialization(department, specialization) {
        RETURN FILTER departmentMap[department] WHERE doctor.specialization == specialization
    }
}

// MAIN
hospital = Hospital()
hospital.addDoctor("Cardiology", Doctor("Dr. Sharma", "Heart Specialist"))
hospital.addDoctor("Cardiology", Doctor("Dr. Rao", "Heart Specialist"))
hospital.addDoctor("Neurology", Doctor("Dr. Mehta", "Brain Surgeon"))

PRINT hospital.getDoctorsBySpecialization("Cardiology", "Heart Specialist")
