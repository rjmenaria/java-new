
 public class inherit {
    String fname ; 
    int age  ; 
    void get (String a ,int b ){
        fname = a ;
        age = b; 
    }
    void print(){
        System.out.println(fname +" "+age);
    }

    public static void main(String[]args){
        h1 r1 = new h1() ;
        r1.get("ravi", 111);
        r1.print();
        
    }
}
class h1 extends inherit {
 int id  ; 
}