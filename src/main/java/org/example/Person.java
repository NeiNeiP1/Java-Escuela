package org.example;

public class Person {
    public String name;
    public Integer dni;
    public Integer age;
    public String gender;
    public String birthday;

    public Person() {
    }

    public Person(String name, Integer dni) {
        this.name = name;
        this.dni = dni;
    }

    public Person(String name, Integer dni, Integer age, String gender, String birthday) {
        this.name = name;
        this.dni = dni;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
    }
    void playing(Person a){
        System.out.println(this.name+"I am breathing: "+a.name);
    }
    void printPerson(){
        System.out.println("Name: "+this.name);
        System.out.println("DNI: "+this.dni);
        System.out.println("Age: "+this.age);
        System.out.println("Gender: "+this.gender);
        System.out.println("Birthday: "+this.birthday);
    }
    void breath(){
        System.out.println("I am breathing: "+this.name);
    }
    void eat(){
        System.out.println("I am eating: "+this.name);
    }
    void sleep(){
        System.out.println("Zzz: "+this.name);
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }




}
