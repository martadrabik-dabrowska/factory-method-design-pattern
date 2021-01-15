package design.pattern.pillows;

public enum PillowShape {
    CIRCLE(30),
    HEART(50);

    private int price;

    PillowShape(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
