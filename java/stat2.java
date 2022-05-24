public class stat2{
    static int n = 0 ;
    stat2(){
        n++ ;
        System.out.println(n);
    }
    public static void main(String[]args){
        stat2 s = new stat2();
        stat2 s1 = new stat2();
        stat2 s2 = new stat2();
        stat2 s3 = new stat2();
        stat2 s4 = new stat2();
        stat2 s5 = new stat2();
    }
}