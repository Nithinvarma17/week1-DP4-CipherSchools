public class Class2 {
    public static void elements(int []arr,int k){
        for(int i=k;i<arr.length;i++){
            int c = arr[i];
            int m=arr[k-1];
            int m1=k-1;
            for(int r=k-2;r>=0;r--){
                if(arr[r]>m){
                    m=arr[r];
                    m1=r;
                }
            }
            if(c<m){
                while(m1<k-1){
                arr[m1]=arr[m1+1];
                m1++;
            }
            arr[k-1]=c;
                
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(arr[k]+" ");
        }

    } 
    public static void main(String[] args){
        int [] arr={50,25,100,200,300};
        elements(arr,0);

    }
        
    
}
