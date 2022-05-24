public class invmethodp {
    void print(){
        System.out.println("hello world");
    }
}
class inv1 extends invmethodp{
    void print(){
        System.out.println("i am in class inv1");
    }
    void get(){
        this.print();
        super.print();
    }

    public static void main(String[]args){
        inv1 i = new inv1();
        i.get();
    }
}
