package MapTask;

import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Supplier;

public class Map <Plus, Minus> {

    private Map<Plus, Minus> map;

    public Map() {
        map = new Map<>();
    }
    public boolean isEmpty() {
        return map.isEmpty();
    }

    public int size() {
        return map.size();
    }

    public void put(Plus plus, Minus minus) {
        map.put(plus, minus);
    }

    public void replace(Plus plus, Minus minus) {
        if(map.containsKey(plus)) {
            map.put(plus, minus);
        }
    }

    public void clear(){
        map.clear();
    }

    public void compute(Plus plus, Function<? super Minus, ? extends Minus> remappingFunction){
        map.compute(plus, remappingFunction);
    }

    public void computeIfPresent(Plus plus, Function<? super Minus, ? extends Minus> remappingFunction){
        map.computeIfPresent(plus, remappingFunction);
    }

    public void computeIfAbsent(Plus plus, Supplier<? extends Minus> mappingFunction){
        map.computeIfAbsent(plus, Plus -> mappingFunction.get());
    }

    public boolean containsKey(Plus key) {
        return map.containsKey(key);
    }

    public boolean containsValue(Plus value) {
        return map.containsValue(value);
    }

}
