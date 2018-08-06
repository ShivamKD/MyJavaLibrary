package Stack;

/**
 *
 * @author ShivamKD
 */
public class Main {
    public static void main(String[] args) {
        // Stack Example
        Stack<String> s = new Stack<>(5);
        s.push("Dubey");
        s.push("Kumar");
        s.push("Shivam");
        
        System.out.println("With Stack");
        
        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
        
        System.out.println("\nWith Growablestack");
        
        // GrowableStack Example
        
        GrowableStack<String> g = new GrowableStack<>();
        g.push("Dubey");
        g.push("Kumar");
        // The size was initially  2
        // but as this is a growable
        // stack we can push more elements.
        g.push("Shivam");
        
        while(!g.isEmpty()){
            System.out.print(g.peek() + " ");
            g.pop();
        }
    }
}

/**
 * Output
 * 
 * 
 * With Stack
 * Shivam Kumar Dubey 
 * With Growablestack
 * Shivam Kumar Dubey
 */
