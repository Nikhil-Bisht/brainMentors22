package brainmentors.java;

public class PowerOfaNumber {
    public static void main(String[] args) {
        int base, exponent = 5;

        base = 2;
        int result = 1;
        while (exponent != 0) {

            result *= base;

            exponent--;
        }
        System.out.println(result);
    }
}
/*
    another way
    int base , exponent=6;

        base=2;
        int   result=1;
        while(exponent!=0){
            for( exponent=5; exponent>0; exponent-- ){
              result *= base;


            }
            System.out.println(result);
        }
*/

