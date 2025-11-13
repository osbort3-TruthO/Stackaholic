package com.pluralsight.model;

public class Topping {
    private String lettuce;
    private String tomato;
    private String peppers;
    private String cheese;
    private String onions;
    private String pickles;
    private String cucumbers;
    private String guacamole;
    private String mushrooms;

    public Topping(String lettuce, String tomato, String peppers, String cheese, String onions, String pickles, String cucumbers, String guacamole, String mushrooms) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.peppers = peppers;
        this.cheese = cheese;
        this.onions = onions;
        this.pickles = pickles;
        this.cucumbers = cucumbers;
        this.guacamole = guacamole;
        this.mushrooms = mushrooms;
    }

    public String getLettuce() {
        return lettuce;
    }

    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }

    public String getTomato() {
        return tomato;
    }

    public void setTomato(String tomato) {
        this.tomato = tomato;
    }

    public String getPeppers() {
        return peppers;
    }

    public void setPeppers(String peppers) {
        this.peppers = peppers;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getOnions() {
        return onions;
    }

    public void setOnions(String onions) {
        this.onions = onions;
    }

    public String getPickles() {
        return pickles;
    }

    public void setPickles(String pickles) {
        this.pickles = pickles;
    }

    public String getCucumbers() {
        return cucumbers;
    }

    public void setCucumbers(String cucumbers) {
        this.cucumbers = cucumbers;
    }

    public String getGuacamole() {
        return guacamole;
    }

    public void setGuacamole(String guacamole) {
        this.guacamole = guacamole;
    }

    public String getMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(String mushrooms) {
        this.mushrooms = mushrooms;
    }

    @Override
    public String toString() {
        return "com.pluralsight.model.Topping{" +
                "lettuce='" + lettuce + '\'' +
                ", tomato='" + tomato + '\'' +
                ", peppers='" + peppers + '\'' +
                ", cheese='" + cheese + '\'' +
                ", onions='" + onions + '\'' +
                ", pickles='" + pickles + '\'' +
                ", cucumbers='" + cucumbers + '\'' +
                ", guacamole='" + guacamole + '\'' +
                ", mushrooms='" + mushrooms + '\'' +
                '}';
    }
}
