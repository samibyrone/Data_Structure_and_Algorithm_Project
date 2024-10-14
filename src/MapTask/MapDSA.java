package MapTask;

import java.util.HashMap;
import java.util.Map;

public class MapDSA {

    private final Map<String, Integer> map;

    public MapDSA() {
        map = new HashMap<>();
    }
    public boolean isEmpty() {
        return map.isEmpty();
    }

    public int size() {
        return map.size();
    }

    public void put(String Pass, Integer value) {
        map.put(Pass, value);
    }

    public void replace(String Pass, Integer value) {
        map.replace(Pass, value);
    }

    public Integer remove(String Pass) {
        return map.remove(Pass);
    }

    public int hashCode() {
        return map.hashCode();
    }

    public Integer get(String Pass){
        return map.get(Pass);
    }

    public void clear(){
        map.clear();
    }

    public void compute(String Pass, java.util.function.BiFunction<String, Integer, Integer> func) {
        map.compute(Pass, func);
    }

    public void computeIfPresent(String key, java.util.function.BiFunction<String, Integer, Integer> func) {
        map.computeIfPresent(key, func);
    }

    public void computeIfAbsent(String key, java.util.function.Function<String, Integer> func) {
        map.computeIfAbsent(key, func);
    }

    public void forEach(java.util.function.BiConsumer<String, Integer> action) {
        map.forEach(action);
    }

    public boolean containsKey(String Pass) {
        return map.containsKey(Pass);
    }

    public boolean containsValue(Integer value) {
        return map.containsValue(value);
    }

}
