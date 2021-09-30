package Java_Assignments1;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		{                                                     
			   int[][] values =                            
			   {                           
			      { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 },                          
			      { 11, 21, 31 }                           
			   };                          
			     for (int row = 0; row < 4; row++)                           
			   {                           
			      for (int col = 0; col < 3; col++)                            
			      {                            
			         System.out.print(values[row][col] + " ");                         
			      }                            
			                  
			      System.out.println();                       
			   }                           
			}  
		
	}

}
