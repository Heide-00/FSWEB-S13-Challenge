package org.example;

import java.util.Arrays;

public class Employee {

    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee( int id,String fullName,String email,String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public void addHealthPlan(int index, String name){
        if(healthplans==null){
            System.out.println("Healt plan dizisi tanımlı değil.");
            return;
        }

        if(index < 0 || index >= healthplans.length){
            System.out.println("Geçersiz indeks: "+index);
            return;
        }

        if(healthplans[index]== null || healthplans[index].trim().isEmpty()){
          healthplans[index]=name;
          System.out.println("Healt plan  eklendi: " +name);
        }else {
            System.out.println("ilgili indeks zaten dolu: " + healthplans[index]);
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

    public String[] getHealthplans() {

        return healthplans;
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

    public void setHealthplans(String[] healthplans) {

        this.healthplans = healthplans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }
}
