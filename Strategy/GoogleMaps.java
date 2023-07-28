package Strategy;

public class GoogleMaps {
    public void findPath(String src, String  dest, String mode) {
        /*
        if(mode == car)
            -----
        else if (mode == bike)
            -----
        */
        PathCalculatorStrategy pathCalculatorStrategy =
                PathCalculatorFactory.getPathCalculatorByMode(mode);
        pathCalculatorStrategy.findPath(src, dest);
    }
}
