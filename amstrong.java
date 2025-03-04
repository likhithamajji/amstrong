import java.util.*;
class amstrong{
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        amstrong(n,temp);
        
    }
    public static void amstrong(int n,int temp) {
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        int sum=0,temp2=n;
        while(temp2!=0){
          int rem=  temp2%10;
        sum+=Math.pow(rem, count);
         temp2=temp2/10;
        }
        System.out.println(sum);
    if(sum==n){
        System.out.println("amstrongnumber");
    }
    else{
        System.out.println("not amstrong number");
    }
}
}