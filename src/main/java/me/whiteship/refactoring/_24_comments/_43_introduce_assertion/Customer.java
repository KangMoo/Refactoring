package me.whiteship.refactoring._24_comments._43_introduce_assertion;

public class Customer {

    private Double discountRate;

    public double applyDiscount(double amount) {
        return (this.discountRate != null) ? amount - (this.discountRate * amount) : amount;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        assert discountRate != null && discountRate > 0; // 주석보다 assert 사용하는 것이 더 좋음. (추후 배포 시에는 예외처리 필요)
        this.discountRate = discountRate;
    }
}
