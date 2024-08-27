package com.sj.empmanagmentapplication;

import java.util.Scanner;

public class Main {

    // Option 1: Make service static if you intend to use it across static methods
    static EmployeeService service = new EmployeeService();
    
    static boolean ordering = true;

    public static void menu() {
        System.out.println("****************Welcome To Employee Management System *********** "
                + "\n1. Add Employee "
                + "\n2. View Employee"
                + "\n3. Update Employee"
                + "\n4. Delete Employee"
                + "\n5. View All Employees"
                + "\n6. Exit ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do {
            menu();
            System.out.println("Enter your Choice:");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Add Employee");
                    service.addEmp();
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.viewEmp();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    service.updateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    service.deleteEmp();
                    break;
                case 5:
                    System.out.println("View All Employees");
                    service.viewAllEmps();
                    break;
                case 6:
                    System.out.println("Thank you for using the application!!");
                    ordering = false; // Set ordering to false to exit the loop
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }

        } while (ordering);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
