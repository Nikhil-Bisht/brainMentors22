package brainmentors.java;

public class armstrongNumber {
    public static void main(String[] args) {
        int n=370;
        int temp=n;
        int result=0;
        while(n>0){
            int r = n%10;
           result += Math.pow(r,3);
           n = n/10;

        }
        if (temp==result){

        System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number ");
        }
    }
}
