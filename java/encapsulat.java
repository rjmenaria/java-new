public class encapsulat{
    private int emp_id ;
    private String fname ;

    void set(int emp_id , String fname){
        this.emp_id = emp_id ;
        this.fname = fname ;
        
    }

    public void get() {
        System.out.println(emp_id); 
        System.out.println(fname);
    }

}