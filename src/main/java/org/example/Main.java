package org.example;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       x();

    }
    public static void x(){

        Company company = new Company(1, "Tek Company.", 50000, new String[15]);


        Employee employee = new Employee(1, "Semra Elçelik", "bshbdhcbs.com", "passwrd",new String[4]);


        Healthplan healthplan = new Healthplan(1, "Health Plan ", Plan.BASIC);


        employee.addHealthPlan(0, "new Health Plan ");


        company.addEmployee(0, "Nehir Elçelik");

        // ToString metotları çağrılıyor
        System.out.println(company);
        System.out.println(employee);
        System.out.println(healthplan);


    }

}


