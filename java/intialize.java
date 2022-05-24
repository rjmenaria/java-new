public class intialize {
    String fname ;
    int id ;
    void get(String a , int b ){
            fname = a  ; 
            id = b ;
    } 
     void display(){
         System.out.println(fname);
         System.out.println(id);
     }
     public static void main(String[]args) {
         intialize r1 = new intialize(); 
         r1.get("ravi menaria", 101);
         r1.display();

         intialize r2  = new intialize() ;
          r2.get("rajesh", 102);
          r2.display();
     }
    
}
