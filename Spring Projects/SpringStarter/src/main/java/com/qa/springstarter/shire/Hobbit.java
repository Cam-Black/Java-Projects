package com.qa.springstarter.shire;

/**
 * Allows for creation of Hobbit Objects.<br>
 * Hobbits have an <code>id</code>, <code>forename</code> and a <code>familyName</code>.
 */
public class Hobbit {
    private int id;
    private String forename;
    private String familyName;
    private int age;

    /**
     * Default constructor to create an empty Hobbit Object.
     */
    public Hobbit() {
        super();
    }

    /**
     * Hobbit Constructor that allows creation of a Hobbit Object with all attributes populated:
     *
     * @param id         An int value to denote a Hobbit Object's position in a List/DataBase.
     * @param forename   A String value for giving a Hobbit a first name.
     * @param familyName A String value for giving a Hobbit their familyName.
     * @param age        An int value for storing the age of a Hobbit.
     */
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
