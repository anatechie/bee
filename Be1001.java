import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Be1001 {
 
    public static void main(String[] args)  {
      
      int A, B, X;
      
      Scanner sc = new Scanner(System.in);
       A = sc.nextInt();
       B = sc.nextInt();
      X = A + B;
      System.out.println("X = " + X);
      sc.close(); 
      
    }
 
}