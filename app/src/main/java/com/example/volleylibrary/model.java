package com.example.volleylibrary;

public class model {
    String firstname;
    int age;
    String mail;

    public model() {
    }

    public model(String firstname, int age, String mail) {
        this.firstname = firstname;
        this.age = age;
        this.mail = mail;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
