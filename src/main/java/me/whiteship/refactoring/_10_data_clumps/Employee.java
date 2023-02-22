package me.whiteship.refactoring._10_data_clumps;

public class Employee {

    private String name;

    private TelephoneNumber personalPhoneNumber;

    public Employee(String name, TelephoneNumber personalPhoneNumber) {
        this.name = name;
        this.personalPhoneNumber = personalPhoneNumber;
    }

    public String getAreaCode() {
        return personalPhoneNumber.getAreaCode();
    }

    public String getNumber() {
        return personalPhoneNumber.getNumber();
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public TelephoneNumber getPersonalPhoneNumber() {
        return personalPhoneNumber;
    }

    public Employee setPersonalPhoneNumber(TelephoneNumber personalPhoneNumber) {
        this.personalPhoneNumber = personalPhoneNumber;
        return this;
    }
}
