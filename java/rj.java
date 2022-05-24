 import java.util.Scanner;
 public class rj {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      
        System.out.print("Enter the First Number: ");
        float a = s.nextFloat();
        System.out.print("Enter the Second Number: ");
        float b = s.nextFloat();
        
        System.out.println("\nResult = " +add(a, b));
     }
     
     public static float add(float x, float y)
     {
        return (x+y);
     }
}
