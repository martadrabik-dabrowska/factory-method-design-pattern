package design.pattern.pillows;

public abstract class Pillow {

    private String description;

    private PillowShape shape;

    protected Pillow(String description, PillowShape shape){
        this.description = description;
        this.shape = shape;
    }


    public String getDescription() {
        return description;
    }

    public PillowShape getShape() {
        return shape;
    }
}
