package brainmentors.java;
class parent {
     void method1(){
         System.out.println("this is method of parent class");
    }
    void method2(){
         System.out.println("this is method2 of parent class");
    }
}
class child extends parent{
    @Override
    void method1(){
        System.out.println("this is method1 of child class");
    }
    void method22(){
        System.out.println("this is method2 of child class");
    }

}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        parent obj = new child();
        obj.method1();
        obj.method2();
    }
}
