//ConcreteBuilder
public class GTBuilder extends BicycleBuilder{
    @Override
    Bicycle getResult() {
        return this.height==29 ?
                new Bicycle("GT", "Avalanche",  this.height, this.colour)
                : null;
    }
}
