package Models;

public enum BotDifficultyLevel {
    EASY(1),
    MED(2),
    HARD(3);

    private final int value;

    BotDifficultyLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
