import java.util.Scanner; 

public class addnum {
    public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
     
    System.out.println("enter your first num");
    int x  = sc.nextInt();
     
    System.out.println("enter second num");
    int y  = sc.nextInt();

     System.out.println(sum(x,y));
    }
    public static int sum(int a , int b){
        return  (a+b);
    }
}
