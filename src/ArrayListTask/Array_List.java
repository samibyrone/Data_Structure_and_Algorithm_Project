package ArrayListTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_List {

    private String [] arraylist;
    private int size;
    private int element;

    public Array_List(){
        element = 50;
        arraylist = new String[element];
        size = 0;
    }

    public void add(String content){
        if(size >= element){ resize(); }
        arraylist[size++] = content;
    }

    public void resize(){
        element *= 2;
        arraylist = Arrays.copyOf(arraylist, element);
    }

    public void remove(String content){
        for(int count = 0; count < arraylist.length; count++){
            if(arraylist[count].equals(content)){
                for(int counter = count; counter < size - 1; counter ++){
                    arraylist[counter] = arraylist[counter + 1];
                }
                arraylist[-- size] = null;
                break;
            }
        }
    }

    public String get(int contain){
        return (0 <= contain && contain < size) ? arraylist[contain] : null;
    }

    public void set(int contain, String content){
        if(0 <= contain && contain < size){
            arraylist[contain] = content;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size(){
        return size;
    }

    public int element(){
        return element;
    }

//    @Override
//    public String toString(){
//        return "ArrayList(size = " + size + ", content = " + Arrays.toString(Arrays.copyOf(arraylist, size)) + ")";
//    }
}

