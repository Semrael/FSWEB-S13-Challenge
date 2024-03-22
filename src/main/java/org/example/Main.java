package org.example;


public class Main {
    public static void main(String[] args) {


    }
    public static void x(){
        Company company=new Company(1,"Tek Company",1000000,new String[10]);
        Employee employee=new Employee(1,"Semra Elçelik","324Qgmai.com","1231dfdf");
        Healthplan healthPlan1=new Healthplan(1,"1.Health plan",Plan.BASIC);
        Healthplan healthPlan2=new Healthplan(2,"2.Health plan",Plan.MID);


        //Çalışana sağlık planı ekleme
        employee.addHealthPlan(0,"1.Health plan");
        employee.addHealthPlan(1,"2.Health plan");

        //Yazılımcı ekleme

        company.addEmployee(0,"Semra Elçelik");
        company.addEmployee(1,"Gizem Ayaz");
        company.addEmployee(2,"Semra Elçelik");


        System.out.println(company);
    }


}