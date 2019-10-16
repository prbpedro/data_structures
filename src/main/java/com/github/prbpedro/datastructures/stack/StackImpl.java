package com.github.prbpedro.datastructures.stack;

import java.util.ArrayList;

public class StackImpl<T> {
    
    private final ArrayList<T> arr;
    
    public StackImpl(Class<T> classType, int size){
        arr = new ArrayList<>();
    }
    
    public void push(T t){
        arr.add(t);
    }
    
    public T pop(){
        if(arr.size()>0){
            return arr.remove(arr.size()-1); 
        }
        
        throw new IllegalStateException();
    }
    
    public int getSize(){
        return arr.size();
    }
}
