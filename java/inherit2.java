public class inherit2 {
    String fname ;
     int age ;

     void get(String n , int a){
         this.fname = n ;
         this.age = a ; 
     }
    void print (){
        System.out.println(fname);
        System.out.println(age);
    }
public static void main(String[]args){
        h2 r = new h2(1121);
        System.out.println(r.roll_no);
        r.get("kajal", 234);
        r.print();
        hhhhh r1 = new hhhhh(1);
       r1.get("hhhhh", 3333);
        r1.print();
        
    }
}
 class h2 extends inherit2 {
    int roll_no ; 
    h2(int r){
        this.roll_no = r ; 
    }
}
class hhhhh extends h2 {
    hhhhh(int r) {
        super(r);
        //TODO Auto-generated constructor stub
    }

    int id  ; 

}
