import java.util.Stack;
public class Class19 {
    public static void sort(Stack<Integer> stack){
        int t = stack.pop();
        sort(stack);
        addInStack(stack,t);
    }
    public static void addInStack(Stack<Integer> stack,int e){
        if(stack.isEmpty() || e>stack.peek()){
            stack.push(e);
            return ;
            
        }
        int t=stack.pop();
        addInStack(stack,e);
        stack.push(t);

    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(9);
        stack.push(7);
        stack.push(2);
        stack.push(3);
        sort(stack);
        System.out.println(stack);

        
    }
}
