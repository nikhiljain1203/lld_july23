package Strategy;

public class PathCalculatorFactory {
    static CarPathCalStrategy carPathCalStrategy = new CarPathCalStrategy();
    public static PathCalculatorStrategy getPathCalculatorByMode(String mode) {
        if (mode.equals("car")) {
            return carPathCalStrategy;
        } else {
            return new BikePathCalStrategy();
        }
    }
}
