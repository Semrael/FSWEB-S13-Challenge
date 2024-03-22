package org.example;

public enum Plan {
    BASIC("basic",2000),
    MID("mid",3000),
    ADVANCE("advance",4000);
    private String name;
    private double price;

    Plan(String name,double price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }



    public double getPrice() {
        return price;
    }


}

