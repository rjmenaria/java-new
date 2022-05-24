public class static1{
    int id ;
    String fname ;
     static String comp_name="sp" ;

    static1(int id ,String fname ){
            this.id= id ;
            this.fname= fname ;
    }
    void print(){
        System.out.println(id+" "+fname+" "+comp_name);
    }
    public static void main(String[]args){
        static1 s1 = new static1(11,"ravi ");
        static1 s2 = new static1(12,"kajal");
        static1 s3 = new static1(13, "mother");
        static1 s4 = new static1(14, "lalit");
        s1.print();
        s2.print();
        s3.print();
        s4.print();
    }
}