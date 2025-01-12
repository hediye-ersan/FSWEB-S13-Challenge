package org.example.enums;

public enum Plan {
    BASIC("Basic", 150),
    PREMIUM("Premium", 200),
    GOLD("Gold", 300);

    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public String toString() {
        return name + " (Price: " + price + ")";
    }

}
