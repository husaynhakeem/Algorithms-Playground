package Utilities.java;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {

    public static <K, V> Map<K, V> createMap(K[] keys, V[] values) {
        final HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }
}
