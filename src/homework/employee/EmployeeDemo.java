package homework.employee;


import java.sql.SQLOutput;
import java.util.Scanner;


public class EmployeeDemo {

    private static Scanner scan = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    private static final String EXIT = "0";
    private static final String ADD_EMPLOYEE = "1";
    private static final String PRINT_ALL_EMPLOYEES = "2";
    private static final String SEARCH_EMPLOYEE_BY_ID = "3";
    private static final String SEARCH_EMPLOYEE_BY_COMPANY_NAME = "4";

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scan.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    searchEmployeeByID();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    searchEmployeeByCompany();
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }


    }

    private static void searchEmployeeByCompany() {
        System.out.println("Please input employee's company name");
        String companyName = scan.nextLine();
        employeeStorage.searchByCompany(companyName);
    }

    private static void searchEmployeeByID() {
        System.out.println("Please input employee's ID");
        String ids = scan.nextLine();
        employeeStorage.searchByID(ids);
    }

    private static void addEmployee() {
        System.out.println("Please input employee's name");
        String name = scan.nextLine();
        System.out.println("Please input employee's surname");
        String surname = scan.nextLine();
        System.out.println("Please input employee's ID");
        String employeeID = scan.nextLine();
        System.out.println("Please input employee's salary");
        Double salary = Double.parseDouble(scan.nextLine());
        System.out.println("Please input employee's company");
        String company = scan.nextLine();
        System.out.println("Please inpout employess's position");
        String position = scan.nextLine();
        Employee employee = new Employee(name, surname, employeeID, salary, company, position);

        Employee employeeByID = employeeStorage.getEmployeeByID(employeeID);
        if (employeeByID == null) {
            employeeStorage.add(employee);
            System.out.println("Employee added");
        } else {
            System.out.println("Employee with " + employeeID + " already exists!");
        }

    }


    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_EMPLOYEE + " for ADD_EMPLOYEE");
        System.out.println("Please input " + PRINT_ALL_EMPLOYEES + " for SEE_All_EMPLOYEES");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_ID + " for SEARCH_EMPLOYEE_BY_ID");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY_NAME + " for SEARCH_EMPLOYEE_BY_COMPANY_NAME");

    }
}
