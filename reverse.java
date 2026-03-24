import java.util.*;
class Solution {
    public int reverse(int x) {
        int revn=0;
        while(x!=0)
        {
            int ld=x%10; 
            x=x/10;
           
           if(revn>Integer.MAX_VALUE/10 || revn==Integer.MAX_VALUE/10 && ld>7)
           return 0;
           if(revn<Integer.MIN_VALUE/10 || revn==Integer.MIN_VALUE/10 && ld<-8)
           return 0;

            revn=(revn*10)+ld;
        }
        return revn;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution abc=new Solution();
        System.out.println(abc.reverse(n));

    }
}