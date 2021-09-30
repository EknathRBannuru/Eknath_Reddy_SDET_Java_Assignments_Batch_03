package Java_Assignments4;

import java.util.Enumeration;
import java.util.Hashtable;

public class KeysHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
	        Hashtable ht = new Hashtable();
	          ht.put("Fruit", "Apple");
	          ht.put("Vegetable", "Onions");
	          ht.put("Flower", "Rose");
	          Enumeration e = ht.keys();
	          while (e.hasMoreElements()) {
	             System.out.println(e.nextElement());
	          }
	    }
		
	}
	
}


