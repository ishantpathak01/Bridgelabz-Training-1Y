package com.gla;

public class Person {

    private int id;
    private String name;
    private String mail;

    public Person() {}

    public Person(int id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            System.out.println("Invalid ID!");
        } else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Name cannot be empty!");
        } else {
            this.name = name;
        }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if (mail == null || !mail.contains("@")) {
            System.out.println("Invalid email!");
        } else {
            this.mail = mail;
        }
    }

    // 🔹 Display method
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Email: " + mail;
    }
}