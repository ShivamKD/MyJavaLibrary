package Stack;

import java.util.EmptyStackException;

/**
 *
 * @author ShivamKD
 * @param <T>
 */
public class GrowableStack<T> implements interfaceStack<T> {

    private int size;
    private T stack[];
    private int top;

    public GrowableStack() {
        // this size initially can be 
        // varied as per the developer
        // Here I have taken a small 
        // value to demonstrate the growing size of the stack.
        this.size = 2;
        top = 0;
        stack = (T[]) new Object[this.size];
    }
    
    
    @Override
    public void push(T item) {
        if(top == size){
            T newStack[] = (T[])new Object[size*2];
            System.arraycopy(stack, 0, newStack, 0, size);
            newStack[size] = item;
            size = size * 2;
            stack = newStack;
        }
        else{
            stack[top] = item;
        }
        
        top++;
    }

    @Override
    public T pop() {
        if(top==0)
            return null;

        T val = stack[top-1];
        top--;
        return val;
    }

    @Override
    public T peek() {
        if(top==0)
            return (T) new EmptyStackException();

        
        return stack[top-1];
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top==0;
    }
    
}
