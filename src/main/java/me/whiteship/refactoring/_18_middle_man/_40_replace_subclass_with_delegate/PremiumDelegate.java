package me.whiteship.refactoring._18_middle_man._40_replace_subclass_with_delegate;

public class PremiumDelegate {

    private Booking booking;
    private PremiumExtra extra;

    public PremiumDelegate(Booking booking, PremiumExtra extra) {
        this.booking = booking;
        this.extra = extra;
    }

    public boolean hasTalkback() {
        return booking.show.hasOwnProperty("talkback");
    }

    public boolean isPeakDay() {
        return booking.isPeakDay();
    }

    public double extendBasePrice(double result) {
        return Math.round(result + this.extra.getPremiumFee());
    }

    public boolean hasDinner() {
        return this.extra.hasOwnProperty("dinner") && !this.isPeakDay();
    }
}
