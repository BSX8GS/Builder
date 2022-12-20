//Director
public class MountainBikeBuildDirector {
    private BicycleBuilder builder;

    public MountainBikeBuildDirector(BicycleBuilder builder) {
        this.builder = builder;
    }

    public void Construct(String colour)
    {
        //Build method
        builder.setAttributes(colour, 29);
    }

    public Bicycle getResult()
    {
        return builder.getResult();
    }
}
