/**
 * 
 */
package Java_Assignments1;

/**
 * @author BannuruE
 *
 */
public class First20NaturalNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 10, count = 1, total = 0;                        
         
		   while(count <= num)                      
		   {                        
		       total = total + count;                       
		       count++;                         
		   }                        
		            
		   System.out.println("Sum of first 10 natural numbers is: "+total);                        
		}    
	}

