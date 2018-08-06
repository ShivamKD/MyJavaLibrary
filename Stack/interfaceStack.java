package Stack;

/**
 *
 * @author ShivamKD
 * @param <T>
 */
public interface interfaceStack<T> {
    public void push(T item);
    public T pop();
    public T peek();
    public int size();
    public boolean isEmpty();
}
