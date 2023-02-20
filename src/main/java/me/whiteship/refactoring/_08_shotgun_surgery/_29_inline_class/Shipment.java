package me.whiteship.refactoring._08_shotgun_surgery._29_inline_class;

public class Shipment {

    private String shippingCompany;

    private String trackingNumber;

    public Shipment(String shippingCompany, String trackingNumber) {
        this.shippingCompany = shippingCompany;
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingInfo() {
        return this.shippingCompany + ": " + this.trackingNumber;
    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public Shipment setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
        return this;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public Shipment setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }
}
