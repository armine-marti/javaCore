package homework.medicalCenter;


import java.util.Date;
import java.util.Objects;

public class Patient extends Person{

    Doctor doctor;
    Date registerDateTime;

    public Patient(String id, String name, String surname, String phoneNumber, Doctor doctor, Date registerDateTime) {
        setId(id);
        setName(name);
        setSurname(surname);
        setPhoneNumber(phoneNumber);
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Patient patient = (Patient) o;
        return Objects.equals(doctor, patient.doctor) && Objects.equals(registerDateTime, patient.registerDateTime);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(doctor);
        result = 31 * result + Objects.hashCode(registerDateTime);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", doctor=" + doctor +
                ", registerDateTime=" + registerDateTime +
                '}';
    }
}
