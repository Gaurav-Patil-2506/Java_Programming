

import java.util.*;
	public class program1 {	
		
		 public static void main(String[] args)
		 {
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.println("Enter the  word to reverse: ");
		     String str = sc.next();	 
		        
		       StringBuffer sbr = new StringBuffer(str);
		        
		       //sbr.reverse();
		       System.out.println(sbr.reverse());
		       
		       sc.close();
		 }
}
