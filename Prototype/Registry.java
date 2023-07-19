package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    Map<String, Student> map =
            new HashMap<>();

    Student get(String key) {
        return map.get(key);
    }

    void register(String key, Student st) {
        map.put(key, st);
    }
}
