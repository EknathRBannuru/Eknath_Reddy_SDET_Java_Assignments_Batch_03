package Java_Assignment3;

public class CheckBrownInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{                     
		    String haystack = "A brown fox ran away fast ";                     
		    String needle = "Brown";                     
		    if (haystack.indexOf(needle) != -1) {                    
		        System.out.println("Found the word " + needle +                      
		                " at index number " + haystack.indexOf(needle));                     
		    } else {                     
		        System.out.println("Can't find " + needle);                      
		    }                     
		    if (haystack.contains(needle)) {                     
		        System.out.println("Found brown!");                      
		    }                    
		} 
		
	}

}
