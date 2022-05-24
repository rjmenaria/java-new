public class inc{
    private  String fname ;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

}
class inc1{
    public static void main(String[]args){
        inc i = new inc();
        i.setFname("banchod das chanchad");
        i.getFname();
    }
}