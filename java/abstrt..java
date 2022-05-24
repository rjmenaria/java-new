abstract  class abstrt{
    abstract void print(); 
}

class abstrt1 extends abstrt{
    void print(){
        System.out.println("hello world");
    }}
class abstrt2 extends abstrt1{
    void print(){
        System.out.println("hello wfvffdforld");
    }

public static void main(String[]args){
    abstrt1 a = new abstrt1() ;
    a.print();

    abstrt2  a1= new abstrt2();
    a1.print();
}
}