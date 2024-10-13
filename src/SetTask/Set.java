package SetTask;

import java.util.ArrayList;

public class Set {

    private static ArrayList<String> set = new ArrayList<>();

    public Set(){
        set = new ArrayList<>();
    }

    public boolean isEmpty(){
        return set.isEmpty();
    }

    public void add(String content){
        if(!set.contains(content)){
            set.add(content);
        }
    }

    public int size(){
        return set.size();
    }

    public void remove(String content){
        if(set.contains(content)){
            set.remove(content);
        } else {
            System.out.println("Content not found in Set");
        }
    }

    public boolean contains(String content){
        return set.contains(content);
    }

    public void clear(){
        set.clear();
    }

    public String toString(){
        return "set(content = " + set + ")";
    }

}
