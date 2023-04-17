package brainmentors.java;
class A {
 String x ="dad";


}
class B extends  A {
 String x ="mom";

   void  print() {
       System.out.println(this.x);
        System.out.println(super.x);
    }
}
public class Super {
    public static void main(String[] args) {
        B obj =new B();

       obj.print();
//        System.out.println(super.name);
    }

}
