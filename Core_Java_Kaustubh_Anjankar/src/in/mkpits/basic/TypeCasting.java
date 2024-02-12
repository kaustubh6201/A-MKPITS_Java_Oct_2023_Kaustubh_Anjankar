package in.mkpits.basic;

public class TypeCasting {

	public static void main(String[] args) {
		// object to primitive
		
		
      String num1 = "55";
      String num2 = "21";
            
      int a = Integer.parseInt(num1);
      int b = Integer.parseInt(num2);
      System.out.println(a+b);
    
      String accNum = "66.255";
       float f =Float.parseFloat(accNum);
       System.out.println(f);
      
      String mobile= "7083017500";
      long l = Long.parseLong(mobile);
      System.out.println(l);
      
      // primitive to object 
      int model = 6545;
      Integer k = new Integer(model);
      System.out.println(k);
      
    		  
      		  
     
     
      
      
      
      
	}

}
