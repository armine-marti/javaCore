package homework.medicalCenter;

import java.util.Objects;

public class Doctor extends Person {

    private String profession;
    private String email;

    public Doctor(){

    }
    public Doctor(String id, String name, String surname, String phoneNumber, String profession, String email) {
        setId(id);
        setName(name);
        setSurname(surname);
        setPhoneNumber(phoneNumber);
        this.profession = profession;
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Doctor doctor = (Doctor) o;
        return Objects.equals(profession, doctor.profession) && Objects.equals(email, doctor.email);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(profession);
        result = 31 * result + Objects.hashCode(email);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", profession='" + profession + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
