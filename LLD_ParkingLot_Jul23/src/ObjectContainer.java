import java.util.HashMap;
import java.util.Map;

public class ObjectContainer {
    private Map<String, Object> objectsMap
            = new HashMap<>();

    public void register(String name, Object object) {
        objectsMap.put(name, object);
    }

    public Object get(String key) {
        return objectsMap.get(key);
    }
}
