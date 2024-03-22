package org.example;

public enum Plan {
    BASIC("basic",2000),
    MID("mid",3000),
    ADVANCE("advance",4000);
    //final değişmesini engelliyor bir kere tanımlıyoruz. final koyulması memoryde kolaylık sağlıyor adresi hep sabit tutuluyor yeri hep belli
    //olduğu için hızlı bir şekilde bulunabiliyor performans artısı vardır. setter koyulamaz final değişkenler için.
    private final String name;
    private final double price;

    Plan(String name,int price){
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

