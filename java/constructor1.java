public class constructor1 {
    int x =5 ;
    public static void main(String[]args){
        constructor1 td = new constructor1();
        constructor1 td1 = new constructor1();
        td1.x = 22 ;

        System.out.println(td.x);
        System.out.println(td1.x);
    }
}
