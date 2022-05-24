public class invokeconsuper {
    invokeconsuper(){
        System.out.println("this is parent class consturctor");
    }
}
class inv extends invokeconsuper{
    inv(){
        super();// by default it is called parent class cvonstructor 
        System.out.println("this is chid class consturctor");
    }
    int n =11;
    public static void main(String[]args){
        inv n =new inv();
        System.out.println(n.n);
    }
}
