package com.bridgelabz;

public class UC1_Empolyee_Wage {
	public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 2;

        if (employeeCheck == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }

}
