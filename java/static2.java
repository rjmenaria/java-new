public class static2{

    static int count = 0 ; 
    int emp_id ;
    String fname ;
    static String cname  = "rj org";
    static int year = 2022 ;

    static2(int emp_id , String fname){
        count++ ; 
        System.out.println(count) ; //count how much object is created 
                                 //if we didnot create static variable when we create new count will again zero
        this.emp_id = emp_id ;
        this.fname  = fname ;
    }

    void display (){
        System.out.println(emp_id+" "+fname+" "+cname+" "+year);
    }
}
class test{
    public static void main(String[]args){
        static2 x = new static2(111, "ravi");
        static2 x1 = new static2(112, "ketan");
        static2 x2 = new static2(113, "gourav");
        static2 x3 = new static2(114, "balsa ");
        static2 x4 = new static2(115, "bharat");
        static2 x5 = new static2(116, "vipul");

        x.display();
        x1.display();
        x2.display();
        x3.display();
        x4.display();
        x5.display();
       
    }
}