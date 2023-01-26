import java.util.Stack;
public class Class18 {
    public static boolean containsDup(String exp){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<exp.length();i++){
            Character c = exp.charAt(i);
            if(c!=')'){
                stack.push(c);
            }else{
                int remove = 0;
                Character top = stack.pop();
                while(top!='('){
                    top=stack.pop();
                    remove++;
                }
                if(remove<1){
                    return true;
                }

            }
            
        }
        return false;

    }
    public static void main(String[] args) {
        containsDup("((1+2))");
    }
}
