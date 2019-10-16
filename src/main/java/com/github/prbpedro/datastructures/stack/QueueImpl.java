package com.github.prbpedro.datastructures.stack;

import java.util.ArrayList;

public class QueueImpl<T> {
    
    private final ArrayList<T> arr;
    
    public QueueImpl(Class<T> classType){
        arr = new ArrayList<>();
    }
    
    public void enqueue(T o){
        arr.add(o);
    }
    
    public T dequeue(){
        if(arr.size()>0){
            return arr.remove(0);   
        }
        
        throw new IllegalStateException();
    }
    
    public int getSize(){
        return arr.size();
    }
}
