package brainmentors.java;

import java.util.ArrayList;

class abc{
    String name;
    String phone;
    String rollNo;
    abc(String name , String phone , String rollNo){
        this.name=name;
        this.phone = phone;
        this.rollNo= rollNo;

    }
}

public class heapVm {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        System.out.println("heap");
        long i=1;
        while(true){
            abc obj = new abc("nikhil", "932222323", "232");
            System.out.println(obj);
            l.add(obj);
            i++;
        }
    }
}
