package Java_Assignments4;

import java.util.ArrayList;
import java.util.Collections;

public class RevArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{                  
		                             
		    ArrayList<String> arrlist = new ArrayList<String>(); 
		    arrlist.add("Apple");                         
		    arrlist.add("Amazon");                        
		    arrlist.add("Facebook");                  
		    arrlist.add("Google");                
		    arrlist.add("IBM");                           
		    arrlist.add("Tesla");                          
		    System.out.println("Before Reverse ArrayList:");                          
		    System.out.println(arrlist);                         
		    Collections.reverse(arrlist);                           
		    System.out.println("After Reverse ArrayList:");                           
		    System.out.println(arrlist);                  
		}               
		
	}

}
