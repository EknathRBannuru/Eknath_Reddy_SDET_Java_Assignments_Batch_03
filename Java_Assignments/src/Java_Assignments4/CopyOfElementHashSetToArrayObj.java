package Java_Assignments4;

import java.util.HashSet;

public class CopyOfElementHashSetToArrayObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{                      
			  HashSet hSet = new HashSet();              
			  hSet.add(new Integer("1"));                 
			  hSet.add(new Integer("2"));                 
			  hSet.add(new Integer("3"));  
			  Object[] objArray = hSet.toArray();                 
			  System.out.println("HashSet elements are copied into an Array Now Array Contains..");                 
			  for(int index=0; index < objArray.length ; index++)                 
			    System.out.println(objArray[index]);                  
			} 
		
	}

}
