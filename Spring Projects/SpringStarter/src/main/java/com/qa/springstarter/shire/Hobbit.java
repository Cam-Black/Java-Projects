package com.qa.springstarter.shire;

public class Hobbit {
    private int id;
    private String forename;
    private String familyName;
    private int age;

    public Hobbit() {
        super();
    }

    public Hobbit(int id, String forename, String familyName, int age) {
        super();
        this.id = id;
        this.forename = forename;
        this.familyName = familyName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hobbit{" +
                "id= '" + id + '\'' +
                "forename='" + forename + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                '}';
    }
}
