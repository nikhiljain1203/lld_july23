package Decorator;

public class OrangeCone implements IceCreamConeConstituents {

    @Override
    public String getDescription() {
        return "Orange Cone";
    }

    @Override
    public int getCost() {
        return 20;
    }

}
