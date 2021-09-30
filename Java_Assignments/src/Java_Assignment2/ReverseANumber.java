package Java_Assignment2;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
			 int num = 123, reversed = 0;
 			while(num != 0) {
 				int digit = num % 10;
            reversed = reversed * 10 + digit;
            num =num/ 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
	}

}
