package brainmentors.java;

/*
public class Patterns {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            for(int j=0; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
*/
/*output:
        *
        **
        ***
        ****
        *****
 */
/*
public class Patterns {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for(int j=0; j<5 ; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
*/
/*
        11111
        22222
        33333
        44444
        55555
*/
/*
public class Patterns {
    public static void main(String[] args) {
        for (int i=5; i>0; i--){
            for(int j=0; j<i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
*/
/*

 *****
 ****
 ***
 **
 *

 */
/* public class Patterns {
    public static void main(String[] args) {
        for (char i='A'; i<='E'; i++){
            for(char j='A'; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
} /*
/*  niche wala output tab aaega jab sop krege i variable ko
            A
            BB
            CCC
            DDDD
            EEEEE
     niche wala output tab aaega jab sop krege j variable ko
            A
            AB
            ABC
            ABCD
            ABCDE
*/
/*
public class Patterns {
    public static void main(String[] args) {
        int n = 1;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println("");
        }
    }
}
*/
/*
        1
        2 3
        4 5 6
        7 8 9 10
*/
public class Patterns {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for(int j=1; j<=15 ; j++){
                if(i==1||j==1||j==15||i==5){
                    System.out.print("*");
                }
                else{

                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}
/*
 ***************
 *             *
 *             *
 *             *
 ***************
 */
