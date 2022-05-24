public class this1 {
    int x ; // instance variable

    public void set(int x){
        this.x = x ;
         
    }
    public void get(){
        System.out.println(x);
    }
    public static void main(String[]args){
        this1 m  = new this1();
        m.set(11);
        m.get();

    }
}
