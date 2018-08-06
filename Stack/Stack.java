package Stack;

import java.util.EmptyStackException;

/**
 *
 * @author ShivamKD
 * @param <T>
 */
public class Stack<T> implements interfaceStack<T>{
    private final int size;
    private T stack[];
    private int top;
    
    // Constructor
    public Stack(int size){
        this.top = 0;
        this.size = size;
        stack = (T[])new Object[size];
    }
    
    @Override
    public void push(T item){
        if(top < size){
            stack[top] = item;
            top++;
        }
        else{
            throw new StackOverflowError();
        }
    }
    
    @Override
    public T pop(){
        if(top==0)
            return null;
        T val = stack[top-1];
        top = top - 1;
        
        return val;
    }
    
    @Override
    public T peek(){
        if(top==0)
            throw new EmptyStackException();
       
        return stack[top-1];
    }
    
    @Override
    public int size(){
        return this.size;
    }
    
    @Override
    public boolean isEmpty(){
        return top==0;
    }
    
}
