package brainmentors.java;

public class ReverseNumber {
    public static void main(String[] args) {
       int n=76546;
        int rev=0;
       while(n!=0){

           int r = n %10;

           rev = (rev * 10) + r;
           n/=10;

       }
        System.out.println(" reversed no. is "+rev);
    }
}
