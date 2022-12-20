//Builder
public abstract class BicycleBuilder {
    public int height;
    public String colour;

    public void setAttributes(String c, int h)
    {
        this.colour = c;
        this.height = h;
    }

    abstract Bicycle getResult();
}
