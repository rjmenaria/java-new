interface i1 {
   public abstract void print();
   public static final int a =10 ;
}
interface i3 {
    void display();
}
interface i4{
    void s();
}
class i2 implements i1,i3,i4{
    int  b= 12;
   public void print(){
        System.out.println("hello");

    }
    public void display(){
        System.out.println("helo brother");
    }
    public void  s(){
        System.out.println("every thing is fine ");
    }

    public static void main(String[]args){
        i2 i = new i2();
        System.out.println(i.a);
        System.out.println(i.b);
        i.print();
        i.display();
        i.s();

    }
}