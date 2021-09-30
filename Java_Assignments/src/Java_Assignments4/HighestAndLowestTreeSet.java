package Java_Assignments4;

import java.util.TreeSet;

public class HighestAndLowestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{                  
			  TreeSet tSet = new TreeSet();               
			  tSet.add("1");                  
			  tSet.add("3");                  
			  tSet.add("2");                  
			  tSet.add("5");                  
			  tSet.add("4"); 
			  System.out.println("Lowest value Stored in Java TreeSet is : " + tSet.first());  
			  System.out.println("Highest value Stored in Java TreeSet is : " + tSet.last());                 
			               
			}
		
	}

}
