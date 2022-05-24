public class runtimep {
    void print(int a){
        System.out.println(1);
    }
    void print(int... a){
        System.out.println(2);
    }
    public static void main(String[]args){
        runtimep r = new runtimep();
        r.print(11,1,12);
    }
}
