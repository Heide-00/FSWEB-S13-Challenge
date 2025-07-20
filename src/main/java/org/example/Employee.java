package org.example;

import java.util.Arrays;

public class Employee {

    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee( int id,String fullName,String email,String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name){
        if(healthPlans==null){
            System.out.println("Health plan dizisi tanımlı değil.");
            return;
        }

        if(index < 0 || index >= healthPlans.length){
            System.out.println("Geçersiz indeks: "+index);
            return;
        }

        if(healthPlans[index]== null || healthPlans[index].trim().isEmpty()){
          healthPlans[index]=name;
          System.out.println("Health plan  eklendi: " +name);
        }else {
            System.out.println("ilgili indeks zaten dolu: " + healthPlans[index]);
        }
    }

    public int getId() {

        return id;
    }

    public String getFullName() {

        return fullName;
    }

    public String getEmail() {

        return email;
    }

    public String getPassword() {

        return password;
    }

    public String[] getHealthPlans() {

        return healthPlans;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public void setHealthPlans(String[] healthPlans) {

        this.healthPlans = healthPlans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
