public class compil {
    Object raj(){
        System.out.println("my name is ravi ");
        return 0 ; 
    }
}
class compil1 extends compil{
    String raj(){
        System.out.println("ok friends");
        return  null ;
    }
    public static void main(String[]args){
        compil r = new compil() ; 
        r.raj();

        compil1 r1 = new compil1() ;
         r1.raj();
    }
}

