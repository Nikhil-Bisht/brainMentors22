package brainmentors.java;

public class factorialNum {
    public static void main(String[] args) {
        int  n=5;  int result= 1;
        for (int i=1; i<=n; i++){
            result *=i;

        }
        System.out.println(result);
    }
}

          /*another approach
      int  n=5;  int result= 1;
        for (int i=n; i>0; i--){
             result *=i;

        }
        System.out.println(result);
    }
    */