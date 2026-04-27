package com.gla;
public class Box<T> {
    private T value;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public static void main(String[] args){
        Box<Number> obj1 = new Box<>();
        obj1.setValue(3333333333333333333L);
        System.out.println(obj1.getValue());
    }
}