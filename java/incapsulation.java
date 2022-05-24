
public class incapsulation {
    private int eid ; 
    public void set(int id){
        eid = id ;
    }
    public void get(){
        System.out.println(eid);
    }
}
class c1 {
    public static void main(String[]args){
        incapsulation i = new incapsulation();
        i.set(15);
        i.get();
    }
}
