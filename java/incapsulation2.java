public class incapsulation2 {
    private String name ;
    public void set (String n ){
        name  = n ;
  }
    public void print (){
        System.out.println(name);
    }
}
class ravi1{
    private String fname ;
    public void set(String n1){
        fname = n1 ;
    }
    public void print(){
        System.out.println(fname);
    }
}
class ravi2{
    public static void main(String[] args){
        
        incapsulation2 x = new incapsulation2(); 
        x.set("ravi menaria");
        x.print();

        ravi1 y = new ravi1();
        y.set("my brother");
        y.print();
    }
}
