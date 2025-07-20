package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
     runApp();
    }

    public static void runApp(){
        String[] employees=new String[2];
        Company company=new Company(1,"Workintech",1000.0,employees);
        company.addEmployee(0,"Jane Doe");

        String[] healths=new String[3];
        Employee employee=new Employee(30,"Ayşe Güçlü","ayseaslan@gmail.com","bmkhgj",healths);
        employee.addHealthPlan(-1,"Test Sigorta");

        HealthPlan healthPlan=new HealthPlan(200,"Standart Health Coverage", Plan.BASIC);

        Plan selectedPlan=Plan.PREMIUM;

        System.out.println(company);
        System.out.println(employee);
        System.out.println(healthPlan);
        System.out.println("Selected Plan: " + selectedPlan);
    }
}