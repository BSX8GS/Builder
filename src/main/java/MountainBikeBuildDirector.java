//Director
public class MountainBikeBuildDirector {
    private BicycleBuilder builder;

    public MountainBikeBuildDirector(BicycleBuilder builder) {
        this.builder = builder;
    }

    public void Construct(String colour)
    {
        builder.colour=colour;
        builder.height = 29;
    }

    public Bicycle getResult()
    {
        return builder.getResult();
    }
}
