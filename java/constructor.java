

public class constructor {
    String fname ;
     int age ;
     constructor(String name , int age1){
        this.fname = name ;
         this.age = age1 ; 
     } 
    public static void main(String[]args){

     constructor r1 = new constructor("", 111);
      System.out.println(r1.fname);
      System.out.println(r1.age);
       
      rrr r2 = new rrr();
      r2.roll_no = 112 ; 
      System.out.println(r2.roll_no);
    }
    
}
class rrr{
    int roll_no ;
        
}
