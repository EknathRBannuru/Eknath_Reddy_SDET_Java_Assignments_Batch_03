package Java_Assignments4;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{               
			   ArrayList<String> listofcountries = new ArrayList<String>();                
			   listofcountries.add("APPLE");               
			   listofcountries.add("PINEAPPLE");               
			   listofcountries.add("GRAPES");              
			   listofcountries.add("ORANGE");  
			   System.out.println("Before Sorting:");              
			   for(String counter: listofcountries){               
			      System.out.println(counter);         
			   }             
			   Collections.sort(listofcountries);               
			   System.out.println("After Sorting:");               
			   for(String counter: listofcountries){               
			      System.out.println(counter);         
			   }           
			}
		
	}

}
