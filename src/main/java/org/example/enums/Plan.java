package org.example.enums;

public enum Plan {
    BASIC("Basic Plan",8),
    PREMIUM("Premium Plan",16);
   // ENTERPRISE("Enterprise Plan",30);

    private final String name;
    private final Integer price;

    Plan(String name,Integer price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return name + " -$" +price;
    }
}
