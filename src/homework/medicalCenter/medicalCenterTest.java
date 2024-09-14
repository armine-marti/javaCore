package homework.medicalCenter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class medicalCenterTest implements medicalCenterInterface {

    private static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            medicalCenterInterface.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_INFO_BY_ID:
                    updateDoctorInfoById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printPatientsByDoctor();
                    break;
                case PRINT_ALL_PATIENTS:
                    patientStorage.printPatients();
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }


    //n6 command
    private static void printPatientsByDoctor() {
        doctorStorage.print();
        System.out.println("please choose doctor ID");
        String doctorId = scanner.nextLine();
        Doctor doctor = doctorStorage.getDoctorById(doctorId);
        if (doctor != null) {
            patientStorage.searchByDoctor(doctor);
        } else {
            System.out.println("invalid doctor's ID");
        }
    }


    //n5 command
    private static void addPatient() {
        doctorStorage.print();
        System.out.println("Please choose the doctor ID of your new patient");
        String doctorId = scanner.nextLine();
        Doctor doctor = doctorStorage.getDoctorById(doctorId);
        if (doctor != null) {
            System.out.println("Please input patient's ID");
            String id = scanner.nextLine();

            Patient patientById = patientStorage.getPatientById(id);
            if(patientById !=null){
                System.out.println("patient with id" +id + " already exists! Try again");
                return;
            }
            System.out.println("Please input patient's name");
            String name = scanner.nextLine();
            System.out.println("Please input patient's surname");
            String surname = scanner.nextLine();
            System.out.println("Please input patient's phone number");
            String phoneNumber = scanner.nextLine();
            System.out.println("Please press Enter if you are sure to add this patient");
            String registerDateTime = scanner.nextLine();
            if (registerDateTime.isBlank()) {
                System.out.println("New patient confirmed!");
                SimpleDateFormat registerDate = new SimpleDateFormat("dd-MM-yyyy HH:mm");
                Date registrationDate = new Date();
                String newDate = registerDate.format(registrationDate);

                System.out.println("Patient's registration date is: " + newDate);
            } else {
                System.out.println("Wrong input! Please input only Enter!");
            }

            Patient patient = new Patient(id, name, surname, phoneNumber, doctor, new Date());

            Patient patientId = patientStorage.getPatientById(id);
            if (patientId == null) {
                patientStorage.add(patient);
                System.out.println("Patient added");
            } else {
                System.out.println("Patient with id " + id + " already exists!");
            }
        } else {
            System.out.println("wrong doctor id");
        }
    }

    //n4 command
    private static void updateDoctorInfoById() {
        doctorStorage.print();
        System.out.println("Please choose doctor's ID");
        String doctorId = scanner.nextLine();
        Doctor doctorById = doctorStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input doctor's new name");
            String name = scanner.nextLine();
            System.out.println("Please input doctor's new surname");
            String surname = scanner.nextLine();
            System.out.println("Please input doctor's new phone number");
            String phoneNumber = scanner.nextLine();
            System.out.println("Please input doctor's new profession");
            String profession = scanner.nextLine();
            System.out.println("Please input doctor's new email");
            String email = scanner.nextLine();

            if (name != null && !name.isEmpty()) {
                doctorById.setName(name);
            }
            if (surname != null && !surname.isEmpty()) {
                doctorById.setSurname(surname);
            }

            if (phoneNumber != null && !phoneNumber.isEmpty()) {
                doctorById.setPhoneNumber(phoneNumber);
            }
            if (profession != null && !profession.isEmpty()) {
                doctorById.setProfession(profession);
            }
            if (email != null && !email.isEmpty()) {
                doctorById.setEmail(email);
            }
            System.out.println("Update was successful");
            System.out.println(doctorById);
        }

    }


    //n3 command
    private static void deleteDoctorById() {
        doctorStorage.print();
        System.out.println("Please input doctor's ID you want to delete");
        String doctorId = scanner.nextLine();
        Doctor doctorById = doctorStorage.getDoctorById(doctorId);
        if (doctorId != null) {
            doctorStorage.deleteDoctor(doctorId);
            System.out.println("Doctor was successfully deleted");
            doctorStorage.print();
        } else System.out.println("Doctor with that ID does not exist");
    }

    //n2 command
    private static void searchDoctorByProfession() {
        System.out.println("Please input doctor's profession");
        String profession = scanner.nextLine();
        doctorStorage.searchDoctorByProfession(profession);
    }

    //n1 command
    private static void addDoctor() {
        System.out.println("Please input doctor's id, name, surname, phone, profession, email WITHOUT SPACE AFTER COMA");
        String doctorDataStr = scanner.nextLine();
        String[] doctorDataArr = doctorDataStr.split(",");
        if (doctorDataArr.length == 6) {
            String id = doctorDataArr[0];
            String email = doctorDataArr[5];

            if (doctorStorage.getDoctorById(id) == null) {
                Doctor doctor = new Doctor();
                doctor.setId(id);
                doctor.setName(doctorDataArr[1]);
                doctor.setSurname(doctorDataArr[2]);
                doctor.setPhoneNumber(doctorDataArr[3]);
                doctor.setProfession(doctorDataArr[4]);

                while (!email.contains("@")) {
                    System.out.println("Invalid email address. Email must contain '@'.");
                    System.out.println("please inout email again");
                    email = scanner.nextLine();
                }
                doctor.setEmail(email);

                doctorStorage.add(doctor);
                System.out.println("Doctor added!");
                doctorStorage.print();
            } else {
                System.out.println("Doctor with id" + id + " already exists");
            }
        } else System.out.println("Invalid input. Please press 1 and input all required fields: id, name, surname, phone, profession, email.");
    }
}





