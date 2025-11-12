package com.pluralsight;

public class Chips {

    private String plainLays;
    private String hotCrunchyCurls;
    private String bbq;
    private String doritos;
    private double price  = 1.50;

    public Chips(String plainLays, String hotCrunchyCurls, String bbq, String doritos) {
        this.plainLays = plainLays;
        this.hotCrunchyCurls = hotCrunchyCurls;
        this.bbq = bbq;
        this.doritos = doritos;
    }

    public String getPlainLays() {
        return plainLays;
    }

    public void setPlainLays(String plainLays) {
        this.plainLays = plainLays;
    }

    public String getHotCrunchyCurls() {
        return hotCrunchyCurls;
    }

    public void setHotCrunchyCurls(String hotCrunchyCurls) {
        this.hotCrunchyCurls = hotCrunchyCurls;
    }

    public String getBbq() {
        return bbq;
    }

    public void setBbq(String bbq) {
        this.bbq = bbq;
    }

    public String getDoritos() {
        return doritos;
    }

    public void setDoritos(String doritos) {
        this.doritos = doritos;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "com.pluralsight.Chips{" +
                "plainLays='" + plainLays + '\'' +
                ", hotCrunchyCurls='" + hotCrunchyCurls + '\'' +
                ", bbq='" + bbq + '\'' +
                ", doritos='" + doritos + '\'' +
                ", price=" + price +
                '}';
    }
}
