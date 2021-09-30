package Java_Assignments4;

import java.util.HashMap;

public class ParticluarHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{    HashMap<Integer, String>                  
		        map = new HashMap<>();                 
		    map.put(1, "Geeks");                  
		    map.put(2, "ForGeeks");                   
		    map.put(null, "GeeksForGeeks");              
		    int keyToBeChecked = 2;                       
		    System.out.println("HashMap: "                
		                       + map);                    
		    boolean isKeyPresent = map.containsKey(keyToBeChecked);  
		    System.out.println("Does key "                
		                       + keyToBeChecked                   
		                       + " exists: "                  
		                       + isKeyPresent);                   
		}                
		
	}

}
