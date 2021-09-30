package Java_Assignment3;

public class ArthException {

	public static void main(String[] args) {
        {                               
            try {                           
              int exampleVariableOne = 500/0;                               
               System.out.println("You are not dividing a number by 0");                               
            } catch (ArithmeticException e) {                               
              System.out.println("Arithmetic Exception: cannot divide by 0");                               
            }                               
          }                               
    }

}
