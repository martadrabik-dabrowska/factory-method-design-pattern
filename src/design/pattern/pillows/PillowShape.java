package design.pattern.pillows;

public enum PillowShape {

    CIRCLE(30, "grey"),
    HEART(50, "red");

    private int price;
    private String color;

    PillowShape(int price, String color){
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
    }

