package homework.employee;


public class EmployeeStorage {

    private Employee[] employeeS = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (employeeS.length == size) {
            extendStorage();
        }
        employeeS[size++] = employee;
    }

    private void extendStorage() {
        Employee[] tmp = new Employee[size + 10];
        System.arraycopy(employeeS, 0, tmp, 0, size);
        employeeS = tmp;
    }

    public Employee getEmployeeByID(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employeeS[i].getEmployeeID().equals(employeeID)) {
                return employeeS[i];
            }
        }
        return null;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employeeS[i]);
        }
    }
    void searchByID (String ids) {
        for (int i = 0; i < size; i++) {
            if (employeeS[i].getEmployeeID().equals(ids)) {
                System.out.println(employeeS[i]);
            } else System.out.println("there is no employee with that ID");
        }
    }

    void searchByCompany (String companyName) {
        for (int i = 0; i < size; i++) {
            if (employeeS[i].getCompany().equals(companyName)) {
                System.out.println(employeeS[i]);
            } else System.out.println("There is no employee with such a company name");
        }
    }
}
