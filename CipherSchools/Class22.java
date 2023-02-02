
import java.util.Deque;
import java.util.LinkedList;
public class Class22 {
    public static void maxWindow(int []arr,int k){
        Deque<Integer> deque = new LinkedList<>();
        int cur=0;
        for(cur=0;cur<k;cur++){

            while(!deque.isEmpty() && arr[cur]>=arr[deque.peekLast()]){
                deque.removeLast();

            }
            deque.addLast(cur);
        }
        for(;cur<arr.length;cur++){
            System.out.println(arr[deque.peek()]);
            while(!deque.isEmpty() && deque.peek()<=cur-k){
                deque.removeFirst();

            }
            while(!deque.isEmpty() && arr[cur]>=arr[deque.peekLast()]){
                deque.removeLast();

            }
            deque.addLast(cur);
        }
        System.out.println(arr[deque.peek()]);
        while(!deque.isEmpty()){
            deque.removeLast();
        }


        }

    
    public static void main(String[] args) {
        int [] arr={7,6,5,4,3,6,6,7,8,8};
        maxWindow(arr,3);
    }
}
