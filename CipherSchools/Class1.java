

public class Class1
{
	 public static boolean meet(int p1,int p2,int s1,int s2){
        if(p1>p2 && s1>s2){
            return false;
        }
        if(p2>p1 && s2>s1){
            return false;
        }
        while(p1>=p2){
            if(p1==p2){
                return true;
            }
            p1=p1+s1;
            p2=p2+s2;
            
        }
        return false;
    }
    public static boolean meet2(int p1,int p2,int s1,int s2){
         if(p1>p2 && s1>s2){
            return false;
        }
        if(p2>p1 && s2>s1){
            return false;
        }
        int d = Math.abs(p1-p2);
        int k= Math.abs(s1-s2);
        if(d%k==0){
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		int p1=3,p2=2,s1=5,s2=0;
		
		boolean ans = meet(p1,p2,s1,s2);
		if(ans==true){
		    System.out.println("They Meet");
		}else{
		    System.out.println("They dont");
		}
		
	}
}

