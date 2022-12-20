public class Main {
    public static void main(String args[])
    {
        BicycleBuilder builder = new GTBuilder();
        MountainBikeBuildDirector director = new MountainBikeBuildDirector(builder);

        director.Construct("Red");
        Bicycle bike = director.getResult();
        System.out.println(
                "A " + bike.getColour()
                + ", " + bike.getHeight() + "cm high "
                + bike.getModel()+" is created.");
    }
}
