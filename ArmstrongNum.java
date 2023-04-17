package brainmentors.java;

import java.util.Scanner;
// modified for unerstaning git pull and push
public class ArmstrongNum {
    public static void main(String[] args) {
      int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check it is armstrong or not");
        int num = sc.nextInt();
        int temp =num;
        while(num!=0){
        int r = num %10 ;
        result += Math.pow(r,3);
        num = num/10;}
        System.out.println(result);
        if(temp ==result){
            System.out.println("armstrong no.");
        }
        else{
            System.out.println("not a armstrong number");
        }

    }
}
