
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Camille
 */
public class JavaApplication3 {

    public static void main(String[] args) {
        // TODO code application logic here
       java.util.Scanner t = new java.util.Scanner(System.in);
       
       System.out.println("Enter two numbers:");
       double num1 = t.nextDouble();
       double num2 = t.nextDouble();
       
       double resultsum = num1 + num2;
       System.out.println("Sum:"+resultsum);
    }
    
}
