public class class1 {
    String fname ; 
    int r_no ;
    public static void main(String[]args){
        class1 ra = new class1() ;
        ra.fname = " ravi menaria" ;
       class1 rr = new class1(); 
        System.out.println(ra.fname);
        System.out.println(rr.fname);
    
        class2 rav = new class2() ; 
        rav.fname = "ravi prakash " ; 
        System.out.println(rav.fname);
        class2 ravi  = new class2(); 
        ravi.run();

        class3 kk = new class3() ; 
        kk.name =" dfdsfsd" ;
        kk.roll_no= 123 ; 
        System.out.println(kk.name);
        System.out.println(kk.roll_no);
    }
    
}
 class class2 {
    String fname ;
   public void run(){
        System.out.println("hello friennds");
   }
}
class class3{
    String name ;
    int roll_no ;

}



