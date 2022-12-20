//Product
public class Bicycle {
    private String make;
    private String model;
    private int height;
    private String colour;

    public Bicycle(String make, String model, int height, String colour) {
        this.make = make;
        this.model = model;
        this.height = height;
        this.colour = colour;
    }

    //Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
