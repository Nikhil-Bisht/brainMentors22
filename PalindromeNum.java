package brainmentors.java;

public class PalindromeNum {
    public static void main(String[] args) {
        int n=1321;
        int temp=n;
        int rev=0;
        while(n!=0){

            int r = n %10;

            rev = (rev * 10) + r;
            n/=10;

        }
       if(rev==temp) {
           System.out.println(" reversed no. is "+rev +"  input no. is "+temp+" it is a palindrome");
    }
       else{
           System.out.println(" reversed no. is "+rev +" but input no. is "+temp+" it is not a palindrome no." );
       }
    }
}
