public class Class4 {
    public static int minP(int [] arr,int dep[] ){
        int r=1;
        int a=1;
        int d=0;
        int p=1;
        while(a<arr.length && d<dep.length){
            int ct=arr[a];
            int ct1 = dep[d];
            if(ct<=ct1){
                p++;
                a++;


            }else{
                p--;
                d++;
            }
            if(p>r){
                r=p;
            }
            
        }
        return r;

    }
    public static void main(String[] args) {
        int arr[]={900,915,1100};
        int dep[]={1000,1105,1200};
        System.out.println(minP(arr,dep));
    }
}
