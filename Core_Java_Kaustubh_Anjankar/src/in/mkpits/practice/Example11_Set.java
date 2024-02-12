package in.mkpits.practice;

import java.util.HashSet;
import java.util.Set;

public class Example11_Set {

	public static void main(String[] args)
	{
	
		try {
		  Set<Integer> arrset1 = new HashSet<Integer>(); 
		  
          arrset1.add(1); 
          arrset1.add(2); 
          arrset1.add(3); 
          arrset1.add(4); 
          arrset1.add(5); 

          System.out.println("Set before retainAll() operation : " + arrset1); 
                            
          Set<Integer> arrset2 = null; 

          System.out.println("Collection Elements to be retained : " + arrset2); 
                   
          // Removing elements from arrset 
          // using retainAll() method 
          arrset1.retainAll(arrset2); 

          System.out.println("Set after retainAll() method :- "+ arrset1); 
                             
      } 

      catch (NullPointerException e) 
		{ 
          System.out.println("Exception thrown : " + e); 
      } 
  

	}

}
