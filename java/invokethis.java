public class invokethis {
    void display(){
        System.out.println("hey brother raja is calling you");
    }

    void print(){
        this.display();
    }
    void raja(){
        print();
    }
    public static void main(String[]args){
        invokethis  i  = new invokethis();
        i.print();
        i.print();

      
    }
    
}
