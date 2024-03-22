package org.example;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id,String name,double giro,String[] developerNames){
        this.id=id;
        this.name=name;
        this.giro=(giro<0)?0:giro;
        this.developerNames=developerNames;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index,String name){
        if(Arrays.binarySearch(developerNames,developerNames[index])>0){
            System.out.println("Bu kiş var.");
        } else if (this.developerNames[index] != null) {
            System.out.println("Burası dolu.");
        }
        else{
            this.developerNames[index]=name;
        }
    }
    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
