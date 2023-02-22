package me.whiteship.refactoring._10_data_clumps;

/**
 * @author kangmoo Heo
 */
public class TelephoneNumber {
    private String areaCode;
    private String number;

    public TelephoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public TelephoneNumber setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public TelephoneNumber setNumber(String number) {
        this.number = number;
        return this;
    }

    @Override
    public String toString() {
        return this.areaCode + "-" + this.number;
    }
}
