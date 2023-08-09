package synckeyword;

public class Count {
    private int value;

    public synchronized void incrementValue(int i) {
        value += i;
    }

    public synchronized void decrementValue(int i) {
        value -= i;
    }

    public int getValue() {
        return value;
    }
}
