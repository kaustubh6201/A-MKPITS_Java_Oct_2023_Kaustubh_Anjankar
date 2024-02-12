package in.mkpits.set;

import java.util.HashSet;
import java.util.Set;

public class RetainAllMethod {

	public static void main(String[] args) 
	{
		Set<Integer> arr = new HashSet<Integer>(); 
		  
        arr.add(1); 
        arr.add(2); 
        arr.add(3); 
        arr.add(4); 
        arr.add(5); 

        System.out.println("Before used RetainAll Method :- "+ arr); 
        System.out.println("------------------");
        
        
        Set<Integer> arr2 = new HashSet<Integer>(); 
        arr2.add(1); 
        arr2.add(2); 
        arr2.add(3); 
        
        System.out.println("Collection Elements to be retained : " + arr2); 
        System.out.println("------------------");
        
        // Removing elements from array set 
        // using retainAll() method 
        
        arr2.retainAll(arr); 
        
        System.out.println("After RetainAll method used :- " + arr); 
                          

	} 

}
