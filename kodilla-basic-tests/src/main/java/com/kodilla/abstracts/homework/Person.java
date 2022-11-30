package com.kodilla.abstracts.homework;

public class Person {
    private String name;
    private int age;
    private Job job;

    public Person(String name, int age, Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Job teacher = new Teacher();
        Person person1 = new Person("Olga", 29, teacher);
        System.out.println("The duties of the teacher include: " + teacher.getResponsibilities());
        System.out.println(person1.name + "'s " + "responsibilities at job are: " + teacher.getResponsibilities());

        Job doctor = new Doctor();
        Person person2 = new Person("Hanna", 33, doctor);
        System.out.println("The duties of the doctor include: " + doctor.getResponsibilities());
        System.out.println(person2.name + "'s " + "responsibilities at job are: " + doctor.getResponsibilities());

        Job vet = new Vet();
        Person person3 = new Person("Ignacy", 35, vet);
        System.out.println("The duties of the vet include: " + vet.getResponsibilities());
        System.out.println(person3.name + "'s " + "responsibilities at job are: " + vet.getResponsibilities());
    }
}
