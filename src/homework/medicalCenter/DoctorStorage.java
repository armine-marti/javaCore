package homework.medicalCenter;

public class DoctorStorage {

    private Doctor[] doctors = new Doctor[10];
    private int size;

    public void add(Doctor doctor) {
        if (doctors.length == size) {
            extendStorage();
        }
        doctors[size++] = doctor;
    }

    private void extendStorage() {
        Doctor[] tmp = new Doctor[size + 10];
        System.arraycopy(doctors, 0, tmp, 0, size);
        doctors = tmp;
    }

    public Doctor getDoctorById(String id){
        for(int i = 0; i<size; i++){
            if (doctors[i].getId().equals(id)){
                return doctors[i];
            }
        }
        return null;
    }

    void searchDoctorByProfession (String profession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equals(profession)) {
                System.out.println(doctors[i]);
            }else System.out.println("There is no doctor with that profession");
        }
    }

    public void print(){
        for(int i = 0; i<size; i++){
            System.out.println(doctors[i]);
        }
    }
    public void deleteDoctor(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                int indexToDelete = i;
                for (i = indexToDelete + 1; i < size; i++) {
                    doctors[i - 1] = doctors[i];
                }
                size--;
            }
        }
    }
}

