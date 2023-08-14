package Models;

import java.util.HashMap;
import java.util.Map;

public enum BotDifficultyLevel {
    EASY(1),
    MED(2),
    HARD(3);

    private final int value;
    private static final Map<Integer, BotDifficultyLevel> reverseMapping;

    static {
        reverseMapping = new HashMap<>();
        for (BotDifficultyLevel level : BotDifficultyLevel.values()) {
            reverseMapping.put(level.value, level);
        }
    }

    BotDifficultyLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static BotDifficultyLevel fromValue(int value) {
        return reverseMapping.get(value);
    }
}
