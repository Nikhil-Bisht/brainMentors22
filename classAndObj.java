package brainmentors.java;

public class classAndObj {
    int roll_no ;
    String course;
    String phoneNo;
    double fees ;
    public static void main(String[] args) {

        classAndObj obj = new classAndObj();
        System.out.println("roll_no  "+obj.roll_no);
        System.out.println("course  "+obj.course);
        System.out.println("phoneNum    "+obj.phoneNo);
        System.out.println("fees    "+obj.fees);

        obj.roll_no =129809;
        obj.course = "bca";
        obj.phoneNo ="976567";
        obj.fees = 9.030;


        System.out.println("roll_no  "+obj.roll_no);
        System.out.println("course  "+obj.course);
        System.out.println("phoneNum    "+obj.phoneNo);
        System.out.println("fees    "+obj.fees);

    }
}
