import java.util.Stack;
public class Class21 {
    public static boolean findCel(int [][]matrix){
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<matrix.length;i++){
            stack.push(i);

        }
        while(stack.size()>=2){
            int person1 = stack.pop();
            int person2 = stack.pop();
            if(matrix[person1][person2]==1){
                stack.push(person2);
            }else{
                stack.push(person1);
            }
        }
        int remp = stack.pop();
        for(int i=0;i<matrix.length;i++){
            if(i!=remp){
                if(matrix[i][remp]==0 || matrix[remp][i]==1){
                    return false;
                }

            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        int [][] matrix = {
            {0,1,0,1},
            {0,0,0,1},
            {0,1,0,1},
            {1,1,1,0}
        };
        System.out.println(findCel(matrix));
    }
    
}
