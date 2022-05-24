public class super1 {
    int a  = 20;
}
class super2 extends super1{
    int a = 11;
    void get(int a ){
        System.out.println(super.a);
    }
    public static void main(String[]args){
        super2 s =new super2();
        s.get(22);
        
    }
}
