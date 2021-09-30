package Java_Assignment2;

public class DupInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{                     
		    int[] my_array = {12, 32, 12, 45, 65, 93, 0, 23, 45, 6 };                    
		            
		    for (int i = 0; i < my_array.length-1; i++)                      
		    {                    
		        for (int j = i+1; j < my_array.length; j++)                      
		        {                    
		            if ((my_array[i] == my_array[j]) && (i != j))                    
		            {                    
		                System.out.println("Duplicate Element : "+my_array[j]);                      
		            }                    
		        }                    
		    }                    
		}  
		
	}

}
