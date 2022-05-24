abstract class vabstrt1 {
    abstract void start();
    void gear(){
        System.out.println("it is okay ");
    }

}
class bike extends vabstrt1{
    void start(){
        System.out.println("start with kick");
    }
}
class scooter extends vabstrt1{
    void start(){
        System.out.println("start with kic");
    }
    public static void main(String[]args){
        bike b = new bike() ;
        b.start();

        scooter s = new scooter();
        s.start();
    }
}
