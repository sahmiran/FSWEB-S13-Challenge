package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] employeeArray = {"basic", "intermadiate", "pro", "premium",null,null,null,null};
        String[] developerArray = {"c++", "c#", "js", "java",null,null,null,null};
        Healthplan healthplan = new Healthplan(1,"deneme1", Plan.BASIC);
        Employee employee = new Employee(123,"Hasan Can Tural","hasancantural19@gmail.com","password",employeeArray);
        Company company = new Company(11,"Microsoft",5.5,developerArray);

        System.out.println(healthplan.toString());
        System.out.println(employee.toString());
        System.out.println(company.toString());
        employee.addHealthplan(1,"mahmut");
        employee.addHealthplan(7,"mahmut");
        System.out.println(employee.toString());;
    }
}