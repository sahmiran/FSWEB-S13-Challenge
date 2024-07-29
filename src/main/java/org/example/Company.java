package org.example;

import java.util.Arrays;

public class Company {
    //id, name, double giro, String[] developerNames
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name,double giro, String[] developerNames){
        this.id=id;
        this.name=name;
        if(giro<0){
            this.giro=0;
        }
        else{
            this.giro=giro;
        }
        this.developerNames=developerNames;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(double giro) {
        if(giro<0){
            this.giro=0;
        }
        else{
            this.giro=giro;
        }
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }
    public void addEmployee(int index, String name){
        if(developerNames[index]==null){
            developerNames[index]=name;
        }
        else if(developerNames[index]!=null){
            System.out.println("Bu healthplan index degeri dolu");
        }
        else if(index> developerNames.length-1){
            System.out.println("Bu index degeri dizide yok");
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
