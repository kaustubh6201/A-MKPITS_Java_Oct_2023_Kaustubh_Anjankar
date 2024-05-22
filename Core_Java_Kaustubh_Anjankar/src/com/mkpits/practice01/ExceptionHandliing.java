package com.mkpits.practice01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandliing {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   int a=0; 
		   int b=0; 
		      
		   try{ 
			   System.out.println("Enter the Number");
			   a=Integer.parseInt(br.readLine());
			   b=Integer.parseInt(br.readLine());
			   
		          System.out.println(a*b); 
		         
		   try {
			System.out.println(a+b);
		}
		   finally 
		   {
			System.out.println("****");
		    }
		   }
		      catch(Exception e){ 
		        e.printStackTrace(); 
		      }

	}

}
