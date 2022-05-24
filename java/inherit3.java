public class inherit3 {
    String fname ; 
    int age ;
    void get (String n , int a){
        this.fname = n ;
        this.age = a ;
    }
    void print(){
        System.out.println(fname);
        System.out.println(age);
    }
    public static void main(String[]args){
        inherit3 r1 = new inherit3() ;
        r1.get("fff", 12);
        r1.print();

        h5 r2 = new h5() ;
        r2.get("ddddd", 11111);
        r2.print();
        r2.get1(1333333);
        r2.print1();

        
        h7 r3 = new h7() ;
        r3.get("ddsdasffffdffffefs", 5555555);
        r3.print();


    }
    
}
class h5 extends inherit3{
    int id ; 
    void get1(int i ){
        this.id = i ; 
    }
    void print1(){
        System.out.println(id);
    }
}
class h7 extends h5 {

}
