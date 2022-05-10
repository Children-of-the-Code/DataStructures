package DataStructure.ArrayList;

import DataStructure.LinkedList.TedsLinkedList;
import Model.Plate;

public class TedsArrayList<T> {
    private T[] things;
    private int size;
    /*
    arraylist.. a wrapper around an array
    how do we make an array that automatically expands when it's full?
    let's say we have an array we're filling with a 100 elements..
    at what point do we decide that the array should be expanded to 200 size?
    we need to keep track of the number of elements that we're storing
     */
    public TedsArrayList(){
        things = (T[]) new Object[2];
        size=0;
    }
    public void add(T thing){
        if(things.length-1 == size){
//            doubleSizeArray
            T[] newArray = (T[]) new Object[things.length*2];
//            copy all the old items from the too small array to the expanded array
            for(int i = 0; i < things.length; i++){
                newArray[i] = things[i];
            }
//            change the things memory reference to point to the expanded array
//            nothing is pointing to the old array any more: it is garbage collected
            things = newArray;
        }
//        add our item
        things[size] = thing;
        size++;
    }

    public T get(int index){
        return things[index];
    }
    public int size(){
        return size;
    }
}
