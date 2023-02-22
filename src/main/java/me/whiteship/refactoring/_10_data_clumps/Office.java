package me.whiteship.refactoring._10_data_clumps;

public class Office {

    private String location;

    private TelephoneNumber officePhoneNumber;

    public Office(String location, TelephoneNumber officePhoneNumber) {
        this.location = location;
        this.officePhoneNumber = officePhoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public Office setLocation(String location) {
        this.location = location;
        return this;
    }

    public TelephoneNumber getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    public Office setOfficePhoneNumber(TelephoneNumber officePhoneNumber) {
        this.officePhoneNumber = officePhoneNumber;
        return this;
    }

    public String getAreaCode() {
        return officePhoneNumber.getAreaCode();
    }

    public String getNumber() {
        return officePhoneNumber.getNumber();
    }
}
