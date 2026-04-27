package com.gla;
public class Faculty extends Person {

    private String subject;

    // 🔹 Default Constructor
    public Faculty() {}

    // 🔹 Parameterized Constructor
    public Faculty(int id, String name, String mail, String subject) {
        super(id, name, mail);
        this.subject = subject;
    }

    // 🔹 Getter
    public String getSubject() {
        return subject;
    }

    // 🔹 Setter with validation
    public void setSubject(String subject) {
        if (subject == null || subject.isEmpty()) {
            System.out.println("Subject cannot be empty!");
        } else {
            this.subject = subject;
        }
    }

    // 🔹 Display
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }
}