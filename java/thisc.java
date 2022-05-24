public class thisc {
    thisc(){
        this(1);
        System.out.println("it  is 1 constructor ");
    }
    thisc(int i ){
        System.out.println("it is perameterize constructor");
    }
    public static void main(String[]args){
        thisc t = new thisc();
    }
}
