package Decorator;

public class ChocolateCone implements IceCreamConeConstituents {
    private IceCreamConeConstituents iceCreamConeConstituents;

    //Base Const
    public ChocolateCone() {}

    //Addon Const
    public ChocolateCone(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public String getDescription() {
        if (iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getDescription() + " + Chocolate Cone";
        }
        return "Chocolate Cone";
    }

    @Override
    public int getCost() {
        if (iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getCost() + 30;
        }
        return 30;
    }
}
