package me.whiteship.refactoring._20_large_class._41_extract_superclass;

/**
 * @author kangmoo Heo
 */
public abstract class Party {
    protected String name;

    public Party(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public double monthlyCost();

    public double annualCost() {
        return this.monthlyCost() * 12;
    }
}
