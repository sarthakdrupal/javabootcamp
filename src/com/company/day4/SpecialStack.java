package com.company.day4;

import java.util.LinkedList;
import java.util.Optional;

public class SpecialStack {
    private int capacity;
    private Integer minimum;
    private LinkedList<Integer> linkedList;
    {
        linkedList = new LinkedList<>();
    }

    SpecialStack(int capacity){
        this.capacity = capacity;
    }
    public void push(Integer e){
        if(this.linkedList.size() < this.capacity) {
            this.linkedList.push(e);
            this.minimum = this.maintainMinimum();
        }

        else
            throw new UnsupportedOperationException();
    }
    public Integer pop(){
        if(!this.isEmpty()) {
            Integer poped = this.linkedList.pop();
            this.maintainMinimum();
            return poped;
        }
        else
            throw new UnsupportedOperationException();
    }
    public boolean isEmpty(){
        return this.linkedList.isEmpty();
    }
    public boolean isFull(){
        return this.linkedList.size() == this.capacity;
    }
    private Integer maintainMinimum() {
        Optional<Integer> optionalInteger = this.linkedList.stream().min( (e1, e2) -> (int)e1 - (int)e2 );
        if(optionalInteger.isPresent()) return  optionalInteger.get().intValue();
        return this.linkedList.getFirst();
    }
    public Integer getMin(){
        return this.minimum;
    }

    @Override
    public String toString() {
        return this.linkedList.toString();
    }
}
class TestSpecialStack {
    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack(10);
        specialStack.push(1);
        specialStack.push(3);
        specialStack.push(4);
        specialStack.push(0);
        specialStack.push(-5);
        specialStack.pop();
        System.out.println(specialStack.getMin());
        System.out.println(specialStack);
    }
}
