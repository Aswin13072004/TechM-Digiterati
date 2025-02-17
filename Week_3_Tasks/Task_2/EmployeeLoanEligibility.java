package Week_3_Tasks.Task_2;

import java.util.Scanner;

public class EmployeeLoanEligibility {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("enter the employee details");
        int id= scanner.nextInt();
        scanner.nextLine();

        String name =scanner.nextLine();

        double sal= scanner.nextDouble();
        scanner.nextLine();

        int yearsWorked = scanner.nextInt();

        employee.setEmplyoyeeDetails(id,name,sal,yearsWorked);

        employee.getEmployeeDetails();

        employee.getLoanEligibity();

        scanner.close();
    }
}
