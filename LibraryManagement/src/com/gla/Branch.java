package com.gla;

public enum Branch {
    CSE("Computer Science"),
    ECE("Electronics"),
    BIOTECH("Biotechnology"),
    MBA("Management"),
    MCA("Computer Applications");

    private String fullName;

    // 🔹 Constructor
    Branch(String fullName) {
        this.fullName = fullName;
    }

    // 🔹 Getter
    public String getFullName() {
        return fullName;
    }
}